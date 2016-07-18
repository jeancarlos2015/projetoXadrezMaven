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
    private final InterfacePeca piaoCor1,reiCor1,rainhaCor1,torreCor1,bispoCor1,cavaloCor1;
    private final InterfacePeca piaoCor2,reiCor2,rainhaCor2,torreCor2,bispoCor2,cavaloCor2;
    public PecaManager(String cor1, String cor2){
        piaoCor1 = new PiaoCor1(cor1);
        reiCor1 = new ReiCor1(cor1);
        rainhaCor1 = new RainhaCor1(cor1);
        torreCor1 = new TorreCor1(cor1);
        bispoCor1 = new BispoCor1(cor1);
        cavaloCor1 = new CavaloCor1(cor1);
        
        piaoCor2 = new PiaoCor2(cor2);
        reiCor2 = new ReiCor2(cor2);
        rainhaCor2 = new RainhaCor2(cor2);
        torreCor2 = new TorreCor2(cor2);
        bispoCor2 = new BispoCor2(cor2);
        cavaloCor2 = new CavaloCor2(cor2);
    }
    
    public InterfacePeca criaPiaoCor1(){
        return (InterfacePeca) piaoCor1.clone();
    }
    
    public InterfacePeca criaReiCor1(){
        return (InterfacePeca) reiCor1.clone();
    }
    
    public InterfacePeca criaRainhaCor1(){
        return (InterfacePeca) rainhaCor1.clone();
    }
    
    public InterfacePeca criaTorreCor1(){
        return (InterfacePeca) torreCor1.clone();
    }
    
    public InterfacePeca criaBispoCor1(){
        return (InterfacePeca) bispoCor1.clone();
    }
    
    public InterfacePeca criaCavaloCor1(){
        return (InterfacePeca) cavaloCor1.clone();
    }
    
    
   
    public InterfacePeca criaPiaoCor2(){
        return (InterfacePeca) piaoCor2.clone();
    }
    
    public InterfacePeca criaReiCor2(){
        return (InterfacePeca) reiCor2.clone();
    }
    
    public InterfacePeca criaRainhaCor2(){
        return (InterfacePeca) rainhaCor2.clone();
    }
    
    public InterfacePeca criaTorreCor2(){
        return (InterfacePeca) torreCor2.clone();
    }
    
    public InterfacePeca criaBispoCor2(){
        return (InterfacePeca) bispoCor2.clone();
    }
    
    public InterfacePeca criaCavaloCor2(){
        return (InterfacePeca) cavaloCor2.clone();
    }
}
