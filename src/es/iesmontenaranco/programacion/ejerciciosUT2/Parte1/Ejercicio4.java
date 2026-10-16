package es.iesmontenaranco.programacion.ejerciciosUT2.Parte1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){

        /* EJERCICIO 4.
        Meter por el teclado la temperatura de ayer y hoy y si hoy llueve o luce el sol. Hacer un programa que haga:
            a) Si la temperatura de hoy es mayor de 20 grados y llueve:
                 Sacar por pantalla: "Hace calor pero está lloviendo".
                 Entre ayer y hoy la temperatura fue de: (sacar la suma de la temperatura de ayer y hoy).
                 Mañana habrá (suma 5 grados a la temperatura de hoy y saca el resultado por pantalla).
            b) Si la temperatura de hoy es menor o igual a 20 grados.
                 Sacar por pantalla: "Parece que llega el otoño".
                 Si además luce el sol visualizar: "Pero luce el sol", en caso contrario visualizar: "y llueve".
        * */

        Scanner teclado = new Scanner(System.in);
        int VALOR = 20;
        System.out.println("Introducir la temperatura de ayer y hoy");
        double temperaturaAyer = teclado.nextDouble();
        double temperaturaHoy = teclado.nextDouble();
        System.out.println("Introducir el tiempo: si llueve o luce el sol");
        teclado.nextLine(); //Para limpiar el buffer, sino lee el Enter
        String tiempo = teclado.nextLine(); //No nos dejaría leer lo que introduzcamos
        //String tiempo = teclado.next(); Almacenaría solamente "luce", no "luce el sol"
        //NextLine() coge el Enter y los saltos de línea
        double sumaTemperaturas = temperaturaAyer + temperaturaHoy;
        String llueve = "llueve";
        String luceSol= "luce el sol";

        if(temperaturaHoy > VALOR && tiempo.equalsIgnoreCase(llueve)){
            System.out.println("Hace calor pero está lloviendo");
            System.out.println("Entre ayer y hoy la temperatura fue de " + sumaTemperaturas + " grados ");
            System.out.println("Mañana habrá " + (sumaTemperaturas + 5) + " grados");
        }else if (temperaturaHoy <= VALOR){ //Hay que añadir else if para que evalúe todas las opciones
            System.out.println("Parece que llega el otoño");
            if(tiempo.equals(luceSol)){
                System.out.println("Pero " +  luceSol);
            }else{
                System.out.println("Y " + llueve);
            }
        }
        /* DEBUG
        * No entrar en ese bloque Step Over
        * Si se quiere entrar Step Into
        * Para pasar al siguient epunto de ruptura se le da al play de la consola.
        * Para acabar se le vuelve a dar al play.
        * En el examen pedirá captura de pantalla de los debug.*/
    }
}
