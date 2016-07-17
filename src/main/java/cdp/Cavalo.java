/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdp;

/**
 *
 * @author jean
 */
public class Cavalo extends AbstractPeca{
    
    public Cavalo() {
        super("C","B");
    }
    
    @Override
    public int[] getPosicoes(){
        
        if(getCor().equals("B")){
            int vetor[] = {10,60};
            return vetor;
        }
        int vetor[] = {17,67};
        return vetor;
    }
}
