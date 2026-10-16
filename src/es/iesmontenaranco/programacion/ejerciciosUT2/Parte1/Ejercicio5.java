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
        int numero = teclado.nextInt();

        if(numero >= 1 && numero <= 20){

            int sumaTotal = 0;
            int pares = 0;
            int impares = 0;
            int sumaCuadrados = 0;

            for(int i = 1; i <= numero; i++){

                sumaTotal = sumaTotal + i;
                sumaCuadrados = sumaCuadrados + (i* i);

                if(i % 2 == 0){
                    pares = pares + i;
                }else{
                    impares = impares + i;
                }
            }
            //System.out AQUÍ
            System.out.println("Suma primeros números naturales: " + sumaTotal);
            System.out.println("Suma números pares: " + pares);
            System.out.println("Suma números impares: " + impares);
            System.out.println("Suma cuadrados: " + sumaCuadrados);
        }else{
            System.out.println("Número no válido");
        }

    }
}
