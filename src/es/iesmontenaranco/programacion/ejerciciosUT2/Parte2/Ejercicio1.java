package es.iesmontenaranco.programacion.ejerciciosUT2.Parte2;

import java.util.Scanner;

public class Ejercicio1 {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la cantidad de perfiles a procesar:");
        double cantidadPerfil = teclado.nextDouble();

        System.out.println("Introduce la longitud del perfil: ");
        double longitudPerfil = teclado.nextDouble();

        double longitudMinima = 1.20;
        double longitudMaxima = 1.30;
        /*
        if(longitudPerfil >= longitudMinima || longitudPerfil <= longitudMaxima){

        }else{
            System.out.println("La longitud del perfil debe estar comprendida entre 1,20 y 1,30");
        }
         */
        while(longitudPerfil >= longitudMinima || longitudPerfil <= longitudMaxima){
            System.out.println("La cantidad de piezas es: " + cantidadPerfil);
        }













    }
}
