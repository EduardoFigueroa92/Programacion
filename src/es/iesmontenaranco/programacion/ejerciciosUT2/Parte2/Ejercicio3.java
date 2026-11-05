package es.iesmontenaranco.programacion.ejerciciosUT2.Parte2;

import java.util.Scanner;

public class Ejercicio3 {
    static void main() {
        /*
Calcula las raíces reales de una ecuación de segundo grado: aX2+bX+c=0.Si no existen raíces
reales indicarlo por pantalla. El valor de a debe ser distinto de cero.
aX2+bX+c=0 =>
Si b2-4ac<0 => No existen raíces reales.
Si b2-4ac=0 => Solo existe una raíz –b/2a.
Si b2-4ac>0 => Existen dos raíces reales.
Nota: Buscar que método de la clase Math nos permite calcular una raíz cuadrada.

* Se pide a, b y c. El valor de a debe ser distinto de 0
* Se calcula b2 - 4ac . Si eso es igual a 0 se muestra -b entre 2 a
* Si el resultado es mayor que cero se calcula
*/

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el valor de a");
        double valorA = teclado.nextDouble();

        System.out.println("Introduce el valor de b");
        double valorB = teclado.nextDouble();

        System.out.println("Introduce el valor de c");
        double valorC = teclado.nextDouble();

        if(valorA != 0){
            //Se hace todo
        }else{
            System.out.println("Introduce otro valor para a, debe ser distinto de 0");
        }





    }
}
