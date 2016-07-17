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
public class Torre extends AbstractPeca{
    
    public Torre() {
        super("T","B");
    }
    @Override
    public int[] getPosicoes(){
        
        if(getCor().equals("B")){
            int vetor[] = {0,70};
            return vetor;
        }
        int vetor[] = {07,77};
        return vetor;
    }
}
