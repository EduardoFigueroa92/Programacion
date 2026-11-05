package es.iesmontenaranco.programacion.ejerciciosUT2.Parte2;

import java.util.Scanner;

public class Ejercicio1 {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el número de piezas a procesar: ");
        int numeroPiezas = teclado.nextInt();
        //Es mejor usar un for porque sabemos el número de veces que se va a repetir

        int piezasAptas = 0;
        for(int i = 1; i <= numeroPiezas; i++){
            System.out.println("Introduzca la longitud para la pieza numero " + i);
            double longitudPieza = teclado.nextDouble();
            if(longitudPieza <= 1.30 && longitudPieza >= 1.20){
                piezasAptas++;
            }
        }
        System.out.println("Número de piezas aptas: " + piezasAptas);
    }
}
