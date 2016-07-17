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
public class TorreCor2 extends TorreAbstract{
    
    public TorreCor2() {
        super("T", "P");
    }
    
    @Override
    public int[] getPosicoes(){
        int vetor[] = {17,87};
        return vetor;
    }
}
