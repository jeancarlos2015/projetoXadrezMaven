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
public class RainhaCor2 extends RainhaAbstract{
    
    public RainhaCor2() {
        super("D", "P");
    }
    
    @Override
    public int[] getPosicoes(){
        int vetor[] = {57};
        return vetor;
    }
}
