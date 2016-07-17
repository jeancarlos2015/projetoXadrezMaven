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
    private final PecaManager manager;
    
    public PecaTabuleiro(Tabuleiro tabuleiro){
        manager = new PecaManager();
        this.tabuleiro = tabuleiro;
    }
    public void setTabuleiro(Tabuleiro tabuleiro){
        this.tabuleiro = tabuleiro;
    }
    
    final void colocaPecaAux(InterfacePeca peca){
        for(Integer posicao: peca.getPosicoes()){
            tabuleiro.seleciona(posicao);
            tabuleiro.colocaNoTabuleiro(peca);
        }
    }
    
    final void colocaPecas(InterfacePeca peca){
        peca.setCor("B");
        colocaPecaAux(peca);
        peca.setCor("P");
        colocaPecaAux(peca);
    }
    
    public InterfacePeca[] getPecas(){
        InterfacePeca[] pecas = {
            manager.criaBispo(),
            manager.criaCavalo(),
            manager.criaPiaoBranco(),
            manager.criaRainha(),
            manager.criaRei(),
            manager.criaTorre(),
            manager.criaPiaoPreto()
        };
        return pecas;
    }
  
    
    public void carregaPecas(){
        for(InterfacePeca peca1:getPecas()){
            colocaPecas(peca1);
        }
    }
    
    
}
