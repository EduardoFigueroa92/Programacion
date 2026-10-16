package es.iesmontenaranco.programacion.ejerciciosUT1;

import java.util.Scanner;

public class Ejercicio2 {
    static void main() {
        /* EJERCICIO 2.
        Realizar un programa que nos pida nuestro nombre y muestre por pantalla un saludo estilo "Hola Mundo".
        * */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = teclado.nextLine();
        System.out.println("Hola " + nombre);

    }
}
