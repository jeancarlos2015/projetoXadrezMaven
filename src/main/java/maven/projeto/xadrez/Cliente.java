/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maven.projeto.xadrez;

import cci.DesignTabuleiro;
import cci.PecaTabuleiro;
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
        DesignTabuleiro design = new DesignTabuleiro();
        PecaTabuleiro pecaTabuleiro = new PecaTabuleiro();
        design.setTabuleiro(tabuleiro);
        pecaTabuleiro.setTabuleiro(tabuleiro);
        pecaTabuleiro.carregaPecasBrancas();
        design.desenhaTabuleiro();
        design.imprimeTabuleiro();
   
        
    }
    
}
