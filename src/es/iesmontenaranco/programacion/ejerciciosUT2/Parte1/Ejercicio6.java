package es.iesmontenaranco.programacion.ejerciciosUT2.Parte1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){

        /* EJERCICIO 6.
        Calcular el factorial de un número positivo menor que 7 (validar por programa).
        NOTA: EL factorial de un número cualquiera se calcula multiplicando desde 1 hasta el mismo número.
        Por ejemplo: 5! = 1*2*3*4*5 = 120. El factorial de cero es siempre 1.
        * */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número positivo menor que 7");
        byte numero = teclado.nextByte();

        if(numero > 0 && numero < 7){
            for(int i = 0; i <= numero; i ++){
                System.out.println(i * i);
            }
        }else{
            System.out.println("Número incorrecto");
        }




    }
}
