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
public class PecaManager {
    private final InterfacePeca piaoBranco,piaoPreto,rei,rainha,torre,bispo,cavalo;
    
    public PecaManager(){
        piaoBranco = new PiaoBranco();
        piaoPreto = new PiaoPreto();
        rei = new Rei();
        rainha = new Rainha();
        torre = new Torre();
        bispo = new Bispo();
        cavalo = new Cavalo();
    }
    
    public InterfacePeca criaPiaoBranco(){
        return (InterfacePeca) piaoBranco.clone();
    }
    
    public InterfacePeca criaPiaoPreto(){
        return (InterfacePeca) piaoPreto.clone();
    }
    
    public InterfacePeca criaRei(){
        return (InterfacePeca) rei.clone();
    }
    
    public InterfacePeca criaRainha(){
        return (InterfacePeca) rainha.clone();
    }
    
    public InterfacePeca criaTorre(){
        return (InterfacePeca) torre.clone();
    }
    
    public InterfacePeca criaBispo(){
        return (InterfacePeca) bispo.clone();
    }
    
    public InterfacePeca criaCavalo(){
        return (InterfacePeca) cavalo.clone();
    }
}
