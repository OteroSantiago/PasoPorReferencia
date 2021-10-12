/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasoporreferencia;

/**
 *
 * @author Santiago
 */
public class PasoPorReferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.nombre = " Juan";
        System.out.println("P1 nombre: "+p1.nombre);
        cambiaValor(p1);
        System.out.println(p1);
    }
    public static Persona cambiaValor(Persona persona){
        if(persona == null){
            return persona;
        }
        persona.nombre = "Carla";
        return persona;
    }
}
