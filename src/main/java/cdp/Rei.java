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
public class Rei extends AbstractPeca{
    
    public Rei() {
        super("R","B");
    }
    @Override
    public int[] getPosicoes(){
        
        if(getCor().equals("B")){
            int vetor[] = {30};
            return vetor;
        }
        int vetor[] = {37};
        return vetor;
    }
}
