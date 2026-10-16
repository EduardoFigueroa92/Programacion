package es.iesmontenaranco.programacion.ejerciciosUT2.Parte1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){

        /* EJERCICIO 3.
        Introducir por el teclado la presión que tiene nuestra caldera de la calefacción (debe ser de tipo
        float) y almacenarla en una variable que llamaremos presión. Si sobrepasa el valor de 2 hacer:
            a) Visualizar por pantalla: Abrir válvula de seguridad.
            b) Disminuir en uno el valor de presión.
        En el caso de que no sobrepase el valor de dos hacer:
            a) Introducir tu nombre por teclado.
            b) Imprimir: "Todo está bien [tu nombre]"
        * */
        Scanner teclado = new Scanner(System.in);
        int VALOR = 2;//CONSTANTE. Valor fijo que no va a variar a lo largo del programa
        float presion = 00.f;
        System.out.println("Introducir presión de la caldera");
        presion = teclado.nextFloat();
        if(presion > VALOR){
            System.out.println("Abrir válvula de seguridad");
            presion = presion-1; //presion--
        }else{
            System.out.println("Introducir tu nombre por el teclado");
            teclado.nextLine();//Añadir otro teclado.nextLine() para limpiar el buffer y que el anterior Enter no esté
            String nombre = teclado.nextLine();
            System.out.println("Todo está bien " + nombre);
        }





    }
}
