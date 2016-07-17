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
public class PiaoBranco extends AbstractPeca{
    
    public PiaoBranco() {
        super("P", "B");
    }
    
    @Override
    public int[] getPosicoes(){
        int vetor[] = {1,11,21,31,41,51,61,71};
        return vetor;
    }
}
