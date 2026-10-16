package es.iesmontenaranco.programacion.ejerciciosUT1;

public class Ejercicio3 {
    static void main() {

            /* EJERCICIO 3.
            Realizar un programa al que llamaremos OperadoresAritmeticos y que nos permita:
               1. Multiplicar 2,2 * 1,0 y al resultado sumarle 5,0. Guardar el resultado en un identificador
                    llamado impuesto. Visualizar el resultado.
               2. Definir una variable, impuesto2 que recoja el resultado de la expresión aritmética siguiente:
                    a la división entera de 12 entre 2, sumarle -8. Visualizar el resultado.
               3. Definir una variable cociente y otra resto, que recoja el cociente entero y el resto, de dividir
                    16 entre 3. Visualiza el resultado. Después define una variable que llamaremos cociente_decimal,
                    que recoja el cociente con decimales.
               4. Asigna a una variable nueve, el valor 9. Haz un programa que defina una variable postIncremento,
                    que tome el valor que tiene nueve y que incremente en uno la variable nueve.
               5. Define una variable preIncremento, que tome incrementado en 1, el valor de nueve, y esta variable
                    acabe también incrementando en 1 su valor. Visualiza resultados.
               6. Define una variable postDecremento que tome el valor de nueve y decremente nueve en 1. Visualiza resultados.
               7. Define una variable preDecremento, que tome decrementando en 1 el valor de nueve y esta variable
                    acabe también decrementada en 1.
            * */

        // 1.
        float num1 = 2.2f;
        float num2 = 1.0f;
        float num3 = 5.0f;
        float impuesto = (num1 * num2) + num3;
        System.out.println(impuesto);

        // 2.
        int num4 = 12;
        int num5 = 2;
        int num6 = -8;
        int impuesto2 = (num4 / num5) + num6;
        System.out.println(impuesto2);

        // 3.
        int num7 = 16;
        int num8 = 3;
        int cociente = num7 / num8;
        int resto = num7 % num8;
        System.out.println("Cociente: " + cociente);
        System.out.println("Resto: " + resto);
        float cociente_decimal = num7 / num8;
        System.out.println("Cociente decimal: " + cociente_decimal);

        // 4.
        int nueve = 9;
        int postIncremento = nueve++;
        System.out.println("Nueve: " + nueve + ", PostIncremento: " + postIncremento);

        // 5.
        int preIncremento = ++nueve;
        System.out.println("Nueve: " + nueve + ", PreIncremento: " + preIncremento);

        // 6.
        int postDecremento = nueve--;
        System.out.println("Nueve: " + nueve + ", PostDecremento: " +postDecremento);

        // 7.
        int preDecremento = --nueve;
        System.out.println("Nueve: " + nueve + ", PreDecremento: " +preDecremento);

        /*
        numero++ --> Primero se utiliza el valor, después aumenta
        ++numero --> Primero aumente, después se utiliza el valor
        numero-- --> Primero se utiliza el valor, después disminuye
        --numero --> Primero disminuye, después se utiliza el valor
        * */




    }
}
