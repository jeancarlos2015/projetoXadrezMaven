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
public class Posicao {
    private String cor = "";
    private boolean situacao = true;
    private InterfacePeca peca = null;

    /**
     * @return the posicao
     */
    
    public boolean isEmpty(){return peca==null;}
    
    public void desabilitar(){situacao=false;}
    
    public void habilitar(){situacao = true;}
    
    public boolean estaHabilitado(){return situacao;}
    
    

    /**
     * @return the cor
     */
    public String getCor() {
        if(isEmpty()){
            return cor;
        }
        return peca.getNome();
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the peca
     */
    public InterfacePeca getPeca() {
        return peca;
    }

    /**
     * @param peca the peca to set
     */
    public void setPeca(InterfacePeca peca) {
        this.peca = peca;
    }
    
    
}
