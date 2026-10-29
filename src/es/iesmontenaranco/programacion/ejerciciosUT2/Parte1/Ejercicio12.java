package es.iesmontenaranco.programacion.ejerciciosUT2.Parte1;

import java.util.Scanner;
/*
public class Ejercicio12 {
    static void main() {

    Realizar un programa que calcule la hipotenusa de un triángulo rectángulo, en función de sus
    catetos (h2 = c2 + c2).

    NOTA: La hipotenusa es la raíz cuadrada de la suma de los catetos al cuadrado.

    Para resolver el ejercicio utilizaremos los métodos siguientes:
    a) introducirCateto: nos devolverá el valor de un cateto.
    b) calcularHipotenusa: calculará la hipotenusa y nos devolverá el valor.
    c) empezar: llamará a los métodos e imprimirá la hipotenusa.
    d) visualizarResultado: visualizará el resultado.
        */
        //Los atributos van arriba del todo
/*
        Scanner teclado = new Scanner(System.in);

        empezar();
    }


    private static float introducirCateto(){
        System.out.println("Introducir cateto: ");
        while(!teclado.hasnextFloat()){
            System.out.println("Hay que introducir un número con decimales: ");
            teclado.next();
        }
        //La última instrucción de los métodos que devuelvan algo es el return
        return teclado.nextFloat();
    }


    private static double calcularHipotenusa(float cateto1, float cateto2){
        float suma_catetos = (float)(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        return Math.sqrt(suma_catetos);
    }


    private static void visualizarResultado(double hipotenusa, float cateto1, float cateto2){
        System.out.printf("La hipotenusa de los catetos  %.2f %.2f es: %.2f", cateto1, cateto2, hipotenusa);
    }


    private static void empezar() {
        float cateto1 = introducirCateto();
        float cateto2 = introducirCateto();
        double hipotenusa = Ejercicio12.calcularHipotenusa(cateto1, cateto2);
        Ejercicio12.visualizarResultado(hipotenusa, cateto1, cateto2);
    }
}
*/