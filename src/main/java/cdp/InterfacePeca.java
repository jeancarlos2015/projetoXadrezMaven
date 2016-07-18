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
public interface InterfacePeca extends Cloneable{
    
    public String   getCor();
    public void     setCor(String cor);
    public Object   clone();
    public String   getNome();
    public int[]    getPosicoes();
    public boolean andar(String posicao);
    public boolean capturar(String posicao);
}
