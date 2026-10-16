package es.iesmontenaranco.programacion;

import java.util.Scanner;

public class TipScanner {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        int edad = 0;
        String nombre = ""; //Cadena vacía

        System.out.println("Introduce tu edad: ");
        edad=teclado.nextInt();
        teclado.nextLine();//Esto limpia el buffer

        System.out.println("Dime tu nombre");
        nombre=teclado.nextLine();

        System.out.println("Tu edad es " + edad + " y tu nombre es " + nombre);
        teclado.close(); //Cerrar al acabar de leer por consola

    }
}
