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
    private PecaManager manager;
    
    public PecaTabuleiro(Tabuleiro tabuleiro){
        this.tabuleiro = tabuleiro;
    }
    
    
    public void setTabuleiro(Tabuleiro tabuleiro){
        this.tabuleiro = tabuleiro;
    }
    
    final void colocaPecas(InterfacePeca peca){
        for(Integer posicao: peca.getPosicoes()){
            tabuleiro.seleciona(posicao);
            tabuleiro.colocaNoTabuleiro(peca);
        }
    }
  
    
    public InterfacePeca[] getPecas(){
        InterfacePeca[] pecas = {
            
            manager.criaBispoCor1(),
            manager.criaCavaloCor1(),
            manager.criaPiaoCor1(),
            manager.criaRainhaCor1(),
            manager.criaReiCor1(),
            manager.criaTorreCor1(),
            
            manager.criaBispoCor2(),
            manager.criaCavaloCor2(),
            manager.criaPiaoCor2(),
            manager.criaRainhaCor2(),
            manager.criaReiCor2(),
            manager.criaTorreCor2()
            
        };
        return pecas;
    }
  
    
    public void carregaPecas(String cor1, String cor2){
        manager = new PecaManager(cor1,cor2);
        for(InterfacePeca peca1:getPecas()){
            colocaPecas(peca1);
        }
    }
    
    
}
