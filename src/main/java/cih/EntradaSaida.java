/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cih;

import java.util.Scanner;

/**
 *
 * @author jean
 */
public class EntradaSaida {

    private final Scanner sc;
    
    public EntradaSaida(){
        sc = new Scanner(System.in);
    }
    
    
    public void imprime(String msg){
        System.out.print(msg);
    }
    
    public String lerPosicao(){
        String posicao = sc.nextLine();
        return posicao;
    }
}
