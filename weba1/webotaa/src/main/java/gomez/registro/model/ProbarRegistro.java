/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gomez.registro.model;

/**
 *
 * @author T107
 */
public class ProbarRegistro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Perro p=new Perro();
        p.setNombre("Panquecita");
        Persona x=new Persona();
        x.setPerro(p);
        //El siguiente es lo que recibira el cliente en el paso 4 
        System.out.println(x.getPerro().getNombre());
    }
    
}
