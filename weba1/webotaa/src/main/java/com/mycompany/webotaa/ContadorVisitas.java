/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.webotaa;

/**
 *
 * @author T107
 */
public class ContadorVisitas {
    
    public static int contador;

    public int getContador() {
        contador++;
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
}
