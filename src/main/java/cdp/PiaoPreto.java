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
public class PiaoPreto extends AbstractPeca{
    
    public PiaoPreto() {
        super("P", "P");
    }
    
    @Override
    public int[] getPosicoes(){
        int vetor[] = {6,16,26,36,46,56,66,76};
        return vetor;
    }
}
