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
public abstract class RainhaAbstract extends AbstractPeca{
    
    public RainhaAbstract(String nome, String cor) {
        super(nome, cor);
    }
    
    @Override
    public boolean andar(String posicao){
        return true;
    }
    
    @Override
    public boolean capturar(String posicao){
        return true;
    }
}
