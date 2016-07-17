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
public class ReiCor1 extends ReiAbstract{
    
    public ReiCor1() {
        super("R","B");
    }
    @Override
    public int[] getPosicoes(){
        int vetor[] = {40};
        return vetor;
    }
}
