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
public class PiaoCor1 extends PiaoAbstract{
    
    public PiaoCor1(String cor) {
        super("P", cor);
    }
    
    @Override
    public int[] getPosicoes(){
        int vetor[] = {11,21,31,41,51,61,71,81};
        return vetor;
    }
}
