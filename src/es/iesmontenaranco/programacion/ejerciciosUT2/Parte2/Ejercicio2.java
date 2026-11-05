package es.iesmontenaranco.programacion.ejerciciosUT2.Parte2;

import java.util.Scanner;

public class Ejercicio2 {
    static void main() {

        /*
        *Hacer un programa que nos permita introducir números por el teclado hasta pulsar el cero.
        Debemos visualizar cada número por pantalla y comprobar si es mayor de 8; si lo es, debemos
        visualizar su doble, en caso contrario su triple. Al finalizar el programa visualizar "Fin".
        * */

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero = teclado.nextInt();

        while (numero != 0){
            System.out.println("El número es: " + numero);
            if (numero > 8){
                System.out.println("El doble del número " + numero + " es: " + numero * 2);
            } else{
                System.out.println("El triple del número " + numero + " es: " + numero * 3);
            }
            System.out.println("Introduce un número");
            numero = teclado.nextInt();
        }
        System.out.println("Fin");
        teclado.close();


        /*  MISMO EJERCICIO HECHO CON DO-WHILE
        Scanner teclado = new Scanner(System.in);
        int numero = 0;

        do{
           System.out.println("El número es: " + numero);
            numero = teclado.nextInt();
            if (numero == 0){
                System.out.println("Fin");
                } else {
                    System.out.println("El número es: " + numero);
                    if (numero > 8){
                        System.out.println("El doble del número " + numero + " es: " + numero * 2);
                        } else{
                            System.out.println("El triple del número " + numero + " es: " + numero * 3);
                        }
                    }
        } while (numero != 0);
        * */





    }
}
