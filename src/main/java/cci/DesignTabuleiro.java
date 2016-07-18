/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cci;

import cdp.Posicao;
import cdp.Tabuleiro;
import cih.EntradaSaida;

/**
 *
 * @author jean
 */
public class DesignTabuleiro {
    private Tabuleiro tabuleiro;
    private final EntradaSaida saida;
    
    public DesignTabuleiro(Tabuleiro tabuleiro){
        saida = new EntradaSaida();
        this.tabuleiro = tabuleiro;
    }
    
    final void desenha_campos_tabuleiro(int posicao_inteiro, Posicao posicao){
        int linha = posicao_inteiro%10;
        int coluna = posicao_inteiro/10;
        String simbol = "   ..   ";
        if(linha%2==0){
            if(coluna%2==0){
                posicao.setCor(simbol.replace("..", "  "));
            }else{
                posicao.setCor(simbol);
            }
        }else{
            if(coluna%2==0){
                posicao.setCor(simbol);
            }else{
                posicao.setCor(simbol.replace("..", "  "));
            }
        }
    }
    
    final void desenhaPosicao(int posicao, String simbolo1){
        String simbol = "   ..   ";
        tabuleiro.seleciona(posicao);
        String simbolo = simbol.replace("..", simbolo1);
        tabuleiro.getPosicao().setCor(simbolo);
    }
    
    final void desenhaLaterais(){
        for(int posicao=0;posicao<9;posicao++){
            desenhaPosicao(posicao, "0"+posicao);
        }
        desenhaPosicao(8, "  ");
        for(int posicao=1;posicao<9;posicao++){
            desenhaPosicao(posicao*10+8,""+ (posicao-1)+"0");
        }
    }

    final void desenhaTabuleiroAux(){
        for(int linha=0;linha<8;linha++){
            for(int coluna=1;coluna<=8;coluna++){
                tabuleiro.seleciona(coluna*10+linha);
                Posicao posicao = new Posicao();
                desenha_campos_tabuleiro(coluna*10+linha, posicao);
                tabuleiro.preenche(posicao);
            }
        }
    }
    
    public void desenhaTabuleiro(){
        desenhaLaterais();
        desenhaTabuleiroAux();
    }
    
    public void imprimeTabuleiro(){
        for(int linha=0;linha<9;linha++){
            saida.imprime("\n");
            for(int coluna=0;coluna<9;coluna++){
                tabuleiro.seleciona(coluna*10+linha);
                Posicao posicao = tabuleiro.getPosicao();
                saida.imprime(posicao.getCor());
            }
        }
    }

    /**
     * @return the tabuleiro
     */
    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

    /**
     * @param tabuleiro the tabuleiro to set
     */
    public void setTabuleiro(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }
}
