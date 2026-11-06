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

b2 -4ac
si da numero negativo solo se muestra mensaje por pantalla
si es mayor de 0 -b +- raiz
-b - raiz
*/

        Scanner teclado = new Scanner(System.in);
        float a;
        do{
            System.out.println("Introduce el valor de a, y que sea distinto de 0: ");
            a = teclado.nextFloat();
        }while(a == 0);

        System.out.println("Introduce el valor de b: ");
        float b = teclado.nextFloat();

        System.out.println("Introduce el valor de c: ");
        float c = teclado.nextFloat();

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

        teclado.close();








    }
}
