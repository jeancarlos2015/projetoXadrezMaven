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
public class Rainha extends AbstractPeca{
    
    public Rainha() {
        super("D","B");
    }
    @Override
    public int[] getPosicoes(){
        
        if(getCor().equals("B")){
            int vetor[] = {40};
            return vetor;
        }
        int vetor[] = {47};
        return vetor;
    }
}
