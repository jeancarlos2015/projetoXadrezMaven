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
public class RainhaCor1 extends RainhaAbstract{
    
    public RainhaCor1() {
        super("D","B");
    }
    @Override
    public int[] getPosicoes(){
        int vetor[] = {50};
        return vetor;
    }
}
