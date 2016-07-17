/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maven.projeto.xadrez;

import cci.DesignTabuleiro;
import cci.PecaTabuleiro;
import cdp.Bispo;
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
        Tabuleiro tabuleiro = Tabuleiro.getInstance();
        tabuleiro.inicializa();
        DesignTabuleiro design = new DesignTabuleiro(tabuleiro);
        PecaTabuleiro pecaTabuleiro = new PecaTabuleiro(tabuleiro);
        
        
        design.desenhaTabuleiro();
        pecaTabuleiro.carregaPecas();
        design.imprimeTabuleiro();

        
    }
    
}
