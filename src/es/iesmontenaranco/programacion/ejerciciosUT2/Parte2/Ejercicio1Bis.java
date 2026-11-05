package es.iesmontenaranco.programacion.ejerciciosUT2.Parte2;

import java.util.Scanner;

public class Ejercicio1Bis {

    private static Scanner teclado = new Scanner(System.in);

    static void main(String[] args) {
        System.out.println("Número de piezas aptas: " + numeroPiezasAptas(obtenerNumeroPiezas()));
    }


    private static int obtenerNumeroPiezas(){
        System.out.println("Introduzca el número de piezas a procesar: ");
        int numeroPiezas = teclado.nextInt();
        return numeroPiezas;
    }


    private static int numeroPiezasAptas(int numeroPiezas){
        int piezasAptas = 0;
        for(int i = 1; i <= numeroPiezas; i++){
            System.out.println("Introduzca la longitud para la pieza numero " + i);
            double longitudPieza = teclado.nextDouble();
            if(longitudPieza <= 1.30 && longitudPieza >= 1.20){
                piezasAptas++;
            }
        }
        return piezasAptas;
    }


}
