package es.iesmontenaranco.programacion.ejerciciosUT2.Parte1;

import java.util.Scanner;

public class Ejercicio1 {
    static void main() {

        /* EJERCICIO 1.
        Meter un número desde el teclado, si es uno, sacar por pantall: "El número es uno", si es dos, sacar por pantalla
         "el número es dos", y si es cualquier otro número sacar por pantalla: " es otro número distinto de uno y dos".
        * */

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número");
        byte numero = teclado.nextByte();

        if(numero == 1){
            System.out.println("El número es uno");
        }else if(numero  == 2){
            System.out.println("El número es dos");
        }else{
            System.out.println("Es otro número distinto de uno y dos");
        }

    }
}
