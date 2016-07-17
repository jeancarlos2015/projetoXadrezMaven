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
public class AbstractPeca implements InterfacePeca{
    private String cor;
    private String nome;
    private Integer posicao;
    
    public AbstractPeca(String nome,String cor){
        this.nome = nome;
        this.cor = cor;
    }
    
    

    @Override
    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    @Override
    public int getPosicao() {
        return posicao;
    }

    @Override
    public String getCor() {
        return cor;
    }

    @Override
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    @Override
    public int[] getPosicoes(){return null;}
    
    @Override
    public Object clone(){
        Object obj = null;
        try{
            obj = super.clone();
        }catch(CloneNotSupportedException ex){
            ex.getMessage();
        }
        return obj;
    }

    /**
     * @return the nome
     */
    @Override
    public String getNome() {
        String simbol = "   .   ";
        return simbol.replace(".", nome+cor);
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean isMoviment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
