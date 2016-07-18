/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author jean
 */
public class TrataString {
    private String posicao;
    
    public void setPosicao(String posicao){
        this.posicao = posicao;
    }
    
    public int getOrigem(){
        String[] posicoes = posicao.split(" ");
        int origem = Integer.parseInt(posicoes[0])+10;
        return origem;
    }
    
    public int getDestino(){
        String[] posicoes = posicao.split(" ");
        int destino = Integer.parseInt(posicoes[1])+10;
        return destino;
    }
}
