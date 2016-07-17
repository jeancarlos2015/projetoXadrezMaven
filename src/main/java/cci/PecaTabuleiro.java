/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cci;

import cdp.InterfacePeca;
import cdp.PecaManager;
import cdp.Tabuleiro;

/**
 *
 * @author jean
 */
public class PecaTabuleiro {
    private Tabuleiro tabuleiro;
    private InterfacePeca peca;
    private final PecaManager manager;
    
    public PecaTabuleiro(){
        manager = new PecaManager();
    }
    public void setTabuleiro(Tabuleiro tabuleiro){
        this.tabuleiro = tabuleiro;
    }
    public void carregaPecasPretas(){
        
    }
    public void carregaPecasBrancas(){
       tabuleiro.seleciona(11);
       peca = manager.criaBispo();
       tabuleiro.colocaNoTabuleiro(peca);
    }
}
