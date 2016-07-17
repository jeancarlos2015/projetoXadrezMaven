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
public class BispoCor2 extends BispoAbstract{
    
    public BispoCor2() {
        super("B", "P");
    }
 @Override
    public int[] getPosicoes(){
        int vetor[] = {37,67};
        return vetor;
    }   
}
