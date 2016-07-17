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
public class CavaloCor2 extends CavaloAbstract{
    
    public CavaloCor2() {
        super("C", "P");
    }
    
    @Override
    public int[] getPosicoes(){
        int vetor[] = {27,77};
        return vetor;
    }
}
