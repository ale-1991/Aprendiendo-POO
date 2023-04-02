
package borradorpoo;

import entidades.Mascota;


/**
 *
 * @author Alejandro Caro
 */
public class BorradorPOO {

    
    public static void main(String[] args) {
        //lo asigno // lo creo
        Mascota m1 = new Mascota();
        
        m1.apodo = "Changuito";
        m1.apodo = "Leon";
        m1.tipo = "perro";
        m1.edad = 3;
        m1.raza = "Ovejero";
        m1.color = "Amarillo y negro";
        m1.cola = true;
        
        System.out.println(m1.apodo+" "+m1.edad+" "+m1.tipo+" "+m1.raza+" ");
        
        
        Mascota m2 = new Mascota();
        
        m1.apodo = "El gunu";
        m1.apodo = "Lobo";
        m1.tipo = "perro";
        m1.edad = 3;
        m1.raza = "Callejero";
        m1.color = "Negro";
        m1.cola = true;
        
        System.out.println(m1.apodo+" "+m1.edad+" "+m1.tipo+" "+m1.raza+" ");
    }

    
}
