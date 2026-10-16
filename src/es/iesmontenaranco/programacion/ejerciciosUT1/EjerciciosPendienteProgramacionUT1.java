package es.iesmontenaranco.programacion.ejerciciosUT1;
import java.util.Scanner;

public class EjerciciosPendienteProgramacionUT1 {
    static void main() {
            /*
             * Crea un programa que pida al usuario una nota, que valide
             * que está entre0 y 10 y muestre su es un suspenso, aprobado,
             * notable o sobresaliente
             * Si coges decimales mejor float que double(para almacenar
             * un número tan pequeño mejor tipo float).
             * Y sin decimales mejor byte por la misma razón.
             * */

        /*Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce tu nota");

        float nota = teclado.nextFloat();
        if(nota >= 0.0f && nota <= 10.0f){
             if(nota >= 5.0f && nota < 7.0f){
                System.out.println("Aprobado");
            }else if(nota >= 7.0f && nota <= 8.0f){
                System.out.println("Notable");
            }else if(nota >= 9.0f && nota <= 10.0f){
                System.out.println("Sobresaliente");
            }else{
                 System.out.println("Suspenso");
             }
        }else{
            System.out.println("Nota no válida. Introduce una nota entre 0 y 10");
        }*/



            /*
             * Switch. Expresión que puede ocupar distintos valores.
             * El break rompe la ejecución
             * Utilizar antes que if-else if si son muchos niveles de anidamiento
             * SENTENCIA ALTERNATIVA MÚLTIPLE
             *  -SINTAXIS SWITCH
             *   switch (expresion){
             *      case valor1:
             *           sentencia/s;
             *           break;
             *      case valor2:
             *           sentencia/s;
             *           break;
             *      [default; //Se puede poner o no. Si toma un valor que no encuentra en ningún case entra por el default.
             *           sentencia/s;
             *           break;]
             * }
             * */

            //EJEMPLO SWITCH
        /*byte nota = 0;
        switch(nota){
            case 1, 2, 3, 4:
                System.out.println("Estás suspenso");
                break;
            case 5, 6:
                System.out.println("Estás aprobado");
                break;
            case 7, 8:
                System.out.println("Estás aprobado y tienes un notable");
                break;
            case 9, 10:
                System.out.println("Estás aprobado y tienes un sobesaliente");
                break;
            default:
                System.out.println("Nota incorrecta");
        }
        System.out.println("FIN");*/



            /*
             * EJERCICIO. Dado un número de mes, mostrar su texto
             * */
        /*Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce un número de mes");
        byte numeroMes = teclado.nextByte();
        switch (numeroMes){
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("Mes incorrecto. Introduce un número entre 1 y 12");
        }*/



            /*
             * EJERCICIO: Dado un mes indica el trimestre en el que está
             * */
        /*String mes = "abril";
        switch(mes){
            case "enero", "febrero", "marzo":
                System.out.println("Primer trimestre");
                break;
            case "abril", "mayo", "junio":
                System.out.println("Segundo trimestre");
                break;
            case "julio", "agosto", "septiembre":
                System.out.println("Tercer trimestre");
                break;
            case "octubre", "noviembre", "diciembre":
                System.out.println("Cuarto trimestre");
            default:
                System.out.println("Mes erróneo");
        }



        String mesLetra = "enero";
        if(mesLetra == "enero" || mesLetra == "febrero" || mesLetra == "marzo"){
            System.out.println("Primer trimestre");
        }else if(mesLetra == "abril" || mesLetra == "mayo" || mesLetra == "junio"){
            System.out.println("Segundo trimestre");
        }else if(mesLetra == "julio" || mesLetra == "agosto" || mesLetra == "septiembre"){
            System.out.println("Tercer trimestre");
        }else if(mesLetra == "octubre" || mesLetra == "noviembre" || mesLetra == "diciembre"){
            System.out.println("Cuarto trimestre");
        }else{
            System.out.println("Introduce un mes correcto en minúsculas");
        }*/



        /* Pedir un número al ususario por teclado. Si es uno, decir que es 1,
        si es dos decir que es 2, y si es cualquier otro número decir que es
        un número distinto.
        * */
        /*Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce un número");
        int numero = teclado.nextInt();

        if(numero == 1){
            System.out.println("Es el número 1");
        }else if(numero == 2){
            System.out.println("El número es 2");
        }else{
            System.out.println("El número es diferente de 1 y 2");
        }*/



        /*Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce un número");
        int numero = teclado.nextInt();
        switch(numero){
            case 1 :
                System.out.println("Es 1");
                break;
            case 2 :
                System.out.println("Es 2");
                break;
            default:
                System.out.println("El número no es ni 1 ni 2");
        }*/

        }
}
