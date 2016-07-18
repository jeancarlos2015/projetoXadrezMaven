/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cci;

import cdp.JogadorAbstract;
import cih.EntradaSaida;

/**
 *
 * @author jean
 */
public class ControleJogo {
    private final Jogo jogo;
    private final EntradaSaida in_out;
    public ControleJogo(String cor1, String cor2){
        jogo = new Jogo();
        jogo.setCor1("B");
        jogo.setCor2("P");
        jogo.incializaComponentes();
        in_out = new EntradaSaida();
    }
    
    
    public void iniciar(JogadorAbstract jogador1, JogadorAbstract jogador2){
        while(true){
            jogo.proximoJoga(jogador1);
            if(jogo.isFinalizado()){
                if(jogador1.desistir()){
                   in_out.imprime("Jogador "+ jogador1.getNome()+ " desistiu");
                }
                break;
            }
  
            jogo.proximoJoga(jogador2);
            
            if(jogo.isFinalizado()){
                if(jogador2.desistir()){
                    in_out.imprime("Jogador "+ jogador2.getNome()+ " desistiu");
                }
                break;
            }
        }
        in_out.imprime(jogo.getMsg());
        
    }
}
