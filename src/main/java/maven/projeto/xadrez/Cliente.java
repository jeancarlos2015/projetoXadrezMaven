/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maven.projeto.xadrez;

import cci.ControleJogo;
import cci.DesignTabuleiro;
import cci.PecaTabuleiro;
import cdp.BispoCor1;
import cdp.JogadorCor1;
import cdp.JogadorCor2;
import cdp.Posicao;
import cdp.Tabuleiro;

/**
 *
 * @author jean
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControleJogo jogo = new ControleJogo("B", "P");
        JogadorCor1 jogador1 = new JogadorCor1("joao", "B");
        JogadorCor2 jogador2 = new JogadorCor2("Rafael", "P");
        jogo.iniciar(jogador1, jogador2);
   /*
        Tabuleiro tabuleiro = Tabuleiro.getInstance();
        tabuleiro.inicializa();
        DesignTabuleiro design = new DesignTabuleiro(tabuleiro);
        PecaTabuleiro pecaTabuleiro = new PecaTabuleiro(tabuleiro);
        design.desenhaTabuleiro();
        pecaTabuleiro.carregaPecas("B","P");
        JogadorCor1 jogador = new JogadorCor1("joao", "B");
        jogador.setTabuleiro(tabuleiro);
        
        
        design.imprimeTabuleiro();
        System.out.println("\n\n\n");
        jogador.move("01 02");
        design.imprimeTabuleiro();
      */
        /*
        String posicao = "01 02";
        String[] posicoes = posicao.split(" ");
        int origem = Integer.parseInt(posicoes[0]);
        int destino = Integer.parseInt(posicoes[1]);
        System.out.println(origem+" "+destino);*/
    }
    
}
