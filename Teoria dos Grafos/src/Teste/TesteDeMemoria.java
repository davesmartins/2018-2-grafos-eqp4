/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class TesteDeMemoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> lista1 = new ArrayList();
        
        lista1.add("valor1");
        lista1.add("valor1");
        
        ArrayList<String> lista2 = lista1;
        
        lista2.add("valor3");
        
        System.out.println(lista1.get(2));


    }
    
}
