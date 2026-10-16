package es.iesmontenaranco.programacion.ejerciciosUT2.Parte1;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){

        /* EJERCICIO 2.
        Meter por teclado tu edad y la de tu compañero. Si eres más joven que tu compañero visualiza: "soy más joven que
        mi compañero". En caso de que sea tu compañero más joven visualiza: "mi compañero es más joven que yo". Y si
        sois de la misma edad: "somos de la misma edad".
        * */

        Scanner teclado = new Scanner(System.in);
        int miEdad = 0;
        int edadCompanero = 0;
        System.out.println("Introduce tu edad");
        miEdad = teclado.nextInt();
        System.out.println("Introducir la edad de tu compañero");
        edadCompanero = teclado.nextInt();

        if(miEdad < edadCompanero){
            System.out.println("Soy más joven que mi compañero");
        }else if(miEdad > edadCompanero){
            System.out.println("Mi compañero es más joven que yo");
        }else{
            System.out.println("Somos de la misma edad");
        }





    }
}
