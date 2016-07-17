/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdp;

/**
 *
 * @author jean
 */
public class Tabuleiro {

    /**
     * @return the instance
     */
    
    private final Posicao[][] tabuleiro;
    private int posicao_inteiro;
    private static Tabuleiro instance;
   
    
    public Tabuleiro(){
        tabuleiro = new Posicao[9][9];
    }
    
    public synchronized static Tabuleiro getInstance() {
        if(instance == null){
            instance = new Tabuleiro();
        }
        return instance;
    }
    
    public void inicializa(){
        for(int linha=0;linha<9;linha++){
            for(int coluna=0;coluna<9;coluna++){
                tabuleiro[coluna][linha] = new Posicao();
            }
        }
    }
    final int getLinha(){return posicao_inteiro/10;}
    
    final int getColuna(){return posicao_inteiro%10;}
    
    /**
     * @return the posicao
     */
    public Posicao getPosicao() {
        return tabuleiro[posicao_inteiro/10][posicao_inteiro%10];
    }

    /**
     * @param posicao the posicao to set
     */
    public void seleciona(int posicao) {
        this.posicao_inteiro = posicao;
    }
    
    public void preenche(Posicao posicao){
        posicao.habilitar();
        tabuleiro[posicao_inteiro/10][posicao_inteiro%10] = posicao;
    }

    public void colocaNoTabuleiro(InterfacePeca peca){
        
        tabuleiro[getLinha()][getColuna()].setPeca(peca);
    }

   
    
    
}
