package es.iesmontenaranco.programacion.ejerciciosUT2.Parte1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){

        /* EJERCICIO 5.
        Hacer un programa que nos permita introducir por el teclado un valor “n” positivo entre 1 y 20 (validarlo
        mediante programa). Calcular:
             la suma de los “n” primeros números naturales
             la suma de los números pares
             la suma de los impares
             la suma de los cuadrados.
        Finalmente mostrar resultados en pantalla.
        * */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número positivo entre 1 y 20");
        byte numero = teclado.nextByte();

        if(numero >= 1 && numero <= 20){



            System.out.println();
        }else{
            System.out.println("Número no válido");
        }


    }
}
