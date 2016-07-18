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
    public JogadorAbstract(String nome, String cor){
        this.selecionou = false;
        this.nome = nome;
        this.cor = cor;
    }
    
    public void move(String posicao){
        String[] posicoes = posicao.split(" ");
        int origem = Integer.parseInt(posicoes[0])+10;
        int destino = Integer.parseInt(posicoes[1])+10;
        tabuleiro.seleciona(origem);
        Posicao p  = tabuleiro.getPosicao();
        peca = p.getPeca();
        p.setPeca(null);
        tabuleiro.seleciona(destino);
        tabuleiro.colocaNoTabuleiro(peca);
    }
    
    public void movimentar(String posicao){
        String[] posicoes = posicao.split(" ");
        int origem = Integer.parseInt(posicoes[0])+10;
        int destino = Integer.parseInt(posicoes[1])+10;
        if(selecionou){
            if(peca.andar(posicao)){
                move(posicao);
                setMsg(peca.getNome()+ "     " + origem + " andou para " +destino);
            }
            else if(peca.capturar(posicao)){
                setMsg(peca.getNome()+"      "+ origem + "capturou " + capturada.getNome()+ " em "+ destino);
            }
        }
    }
    
    
    
    public void selecionar(String posicao){
        String[] posicoes = posicao.split(" ");
        int origem = Integer.parseInt(posicoes[0])+10;
        tabuleiro.seleciona(origem);
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
