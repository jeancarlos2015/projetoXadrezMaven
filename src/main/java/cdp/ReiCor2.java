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
public class ReiCor2 extends ReiAbstract{

    public ReiCor2(String cor) {
        super("R", cor);
    }
    
    
    
    @Override
    public int[] getPosicoes(){
        int vetor[] = {47};
        return vetor;
    }
}
