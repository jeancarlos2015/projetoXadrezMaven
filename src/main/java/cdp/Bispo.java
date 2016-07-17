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
public class Bispo extends AbstractPeca{
    
    public Bispo() {
        super("B","B");
        
    }
    
    @Override
    public int[] getPosicoes(){
        
        if(getCor().equals("B")){
            int vetor[] = {20,50};
            return vetor;
        }
        int vetor[] = {27,57};
        return vetor;
    }
    
    
    
}
