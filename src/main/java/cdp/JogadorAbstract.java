/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdp;

import util.TrataString;

/**
 *
 * @author jean
 */
public abstract class JogadorAbstract implements JogadorInterface{
    private final String nome;
    private final String cor;
    private int pontos = 0;
    private InterfacePeca peca;
    private InterfacePeca capturada;
    private Posicao posicao_tabuleiro;
    private Tabuleiro tabuleiro;
    private boolean selecionou;
    private String msg;
    private TrataString trata;
    public JogadorAbstract(String nome, String cor){
        this.selecionou = false;
        this.nome = nome;
        this.cor = cor;
        trata = new TrataString();
    }
    
    public void move(String posicao){
        trata.setPosicao(posicao);
        tabuleiro.seleciona(trata.getOrigem());
        Posicao p  = tabuleiro.getPosicao();
        peca = p.getPeca();
        p.setPeca(null);
        tabuleiro.seleciona(trata.getDestino());
        tabuleiro.colocaNoTabuleiro(peca);
    }
    
    public void movimentar(String posicao){
        trata.setPosicao(posicao);
        if(selecionou){
            if(peca.andar(posicao)){
                move(posicao);
                setMsg(peca.getNome()+ "     " + trata.getOrigem() + " andou para " +trata.getDestino());
            }
            else if(peca.capturar(posicao)){
                setMsg(peca.getNome()+"      "+ trata.getOrigem() + "capturou " + capturada.getNome()+ " em "+ trata.getDestino());
            }
        }
    }
    
    
    
    public void selecionar(String posicao){
        trata.setPosicao(posicao);
        tabuleiro.seleciona(trata.getOrigem());
        posicao_tabuleiro = tabuleiro.getPosicao();
        if(!posicao_tabuleiro.isEmpty()){
            peca = posicao_tabuleiro.getPeca();
            selecionou = peca.getCor().equals(getCor());
            if(selecionou){
                selecionou = peca.andar(posicao)|peca.capturar(posicao);
            }
        }else{
            selecionou = false;
        }
    }
    
    public boolean desistir(){return false;}
    
    
    public boolean checkMate(){return false;}
    /**
     * @return the tabuleiro
     */
    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

    /**
     * @param tabuleiro the tabuleiro to set
     */
    @Override
    public void setTabuleiro(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @return the pontos
     */
    public int getPontos() {
        return pontos;
    }

    /**
     * @param pontos the pontos to set
     */
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    @Override
    public void joga(String posicao) {
        selecionar(posicao);
        movimentar(posicao);
    }

    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg the msg to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    
}
