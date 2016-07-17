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
    public void movimenta();
    public void setPosicao(int posicao);
    public int getPosicao();
    public String getCor();
    public void setCor(String cor);
    public Object clone();
    public String getNome();
}
