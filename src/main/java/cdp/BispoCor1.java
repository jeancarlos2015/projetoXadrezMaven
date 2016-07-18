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
public class BispoCor1 extends BispoAbstract{
    
    public BispoCor1(String cor) {
        super("B",cor);
        
    }
    
    @Override
    public int[] getPosicoes(){
        int vetor[] = {30,60};
        return vetor;
    }
    
    
    
}
