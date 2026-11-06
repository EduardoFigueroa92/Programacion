package es.iesmontenaranco.programacion.ejerciciosUT2.Parte2;

import java.util.Scanner;

public class Ejercicio3Bis {

    //el teclado se crea como atributo privado de la clase
    private static Scanner teclado = new Scanner(System.in);

    static void main() {
        ejecutar();
    }

    // Método ejecutar. Puede quitarse y ponerlo directamente en el main
    private static void ejecutar(){
        float a = validarNumeroDistintoCero(a);
        float b = leerNumeroFloat();
        float c = leerNumeroFloat();
        calcularRaiz(a, b, c);
        teclado.close();
    }


    //Leer número float
    private static float leerNumeroFloat(){
        System.out.println("Introduce un número decimal: ");
        return teclado.nextFloat();
    }


    //Introduzco b y c
    private static float validarNumeroDistintoCero(float a){
        float numero;
        do{
            System.out.println("Introduce un número que sea distinto de 0: ");
            numero = teclado.nextFloat();
        }while(a == 0);
        return numero;
    }


    // Calculo la raíz (es void porque solo muestra mensajes, no devulve nada)
    private static void calcularRaiz(float a, float b, float c){
        float resultado = (float)(Math.pow(b,2) - (4 * a * c));

        if(resultado < 0){
            System.out.println("No existen raices reales");
        }else if(resultado == 0){
            System.out.println("Sólo existe una raíz real y es :" + (-b/(2*a)));
        }else{
            float raiz1 = (float)(-b + Math.sqrt(resultado)) / ( 2 * a);
            float raiz2 = (float)(-b - Math.sqrt(resultado)) / ( 2 * a);
            System.out.println("Existen 2 racies reales: " + raiz1 + " y " + raiz2);
        }
    }

}
