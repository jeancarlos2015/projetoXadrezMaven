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
public class CavaloCor1 extends CavaloAbstract{
    
    public CavaloCor1(String cor) {
        super("C",cor);
    }
    
    @Override
    public int[] getPosicoes(){
        int vetor[] = {20,70};
        return vetor;
    }
}
