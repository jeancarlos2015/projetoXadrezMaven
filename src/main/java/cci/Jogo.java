/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cci;

import cdp.JogadorAbstract;
import cdp.Tabuleiro;
import cih.EntradaSaida;

/**
 *
 * @author jean
 */
public class Jogo {
    private JogadorAbstract jogador;
    private final Tabuleiro tabuleiro;
    private final DesignTabuleiro design;
    private final PecaTabuleiro controlePecas;
    private final EntradaSaida saida_entrada;
    private String msg;
    private String cor1, cor2;
    
    public Jogo(){
        tabuleiro = Tabuleiro.getInstance();
        design = new DesignTabuleiro(tabuleiro);
        tabuleiro.inicializa();
        controlePecas = new PecaTabuleiro(tabuleiro);
        controlePecas.carregaPecas(cor1, cor2);
        saida_entrada = new EntradaSaida();
    }
    
    public void incializaComponentes(){
        design.desenhaTabuleiro();
        controlePecas.carregaPecas(cor1, cor2);
    }
    
    public void proximoJoga(JogadorAbstract jogador){
        saida_entrada.imprime(jogador.getNome()+"  "+jogador.getCor()+"  joga\n");
        design.imprimeTabuleiro();
        
        this.jogador = jogador;
        saida_entrada.imprime("\nposicao:\n");
        String posicao = saida_entrada.lerPosicao();
        jogador.setTabuleiro(tabuleiro);
        jogador.joga(posicao);
        if(jogador.checkMate()){
            msg = "Checkmate, o jogador "+jogador.getNome()+" ganhou";
        }else{
            msg = jogador.getMsg();
        }
        saida_entrada.imprime("\n");
    }
    
    public boolean isFinalizado(){
        return jogador.checkMate()|jogador.desistir();
    }

    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @return the cor1
     */
    public String getCor1() {
        return cor1;
    }

    /**
     * @param cor1 the cor1 to set
     */
    public void setCor1(String cor1) {
        this.cor1 = cor1;
    }

    /**
     * @return the cor2
     */
    public String getCor2() {
        return cor2;
    }

    /**
     * @param cor2 the cor2 to set
     */
    public void setCor2(String cor2) {
        this.cor2 = cor2;
    }
    
}
