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
public class TorreCor1 extends AbstractPeca{
    
    public TorreCor1() {
        super("T","B");
    }
    
    @Override
    public int[] getPosicoes(){
        int vetor[] = {10,80};
        return vetor;
    }
}
