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
    
    private Posicao[][] tabuleiro;
    private int posicao_inteiro;
    private static Tabuleiro instance;
    private InterfacePeca peca;
    
    public Tabuleiro(){
        tabuleiro = new Posicao[8][8];
    }
    
    public synchronized static Tabuleiro getInstance() {
        if(instance == null){
            instance = new Tabuleiro();
        }
        return instance;
    }
    
    public void inicializa(){
        for(int linha=0;linha<8;linha++){
            for(int coluna=0;coluna<8;coluna++){
                tabuleiro[coluna][linha] = new Posicao();
            }
        }
    }

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
        tabuleiro[posicao_inteiro/10][posicao_inteiro%10] = posicao;
    }

    public void colocaNoTabuleiro(InterfacePeca peca){
        Posicao p = tabuleiro[posicao_inteiro/10][posicao_inteiro%10];
        System.out.println(p.isEmpty());
    }

    /**
     * @param peca the peca to set
     */
    public void setPeca(InterfacePeca peca) {
        this.peca = peca;
    }
    
    
}
