package es.iesmontenaranco.programacion.ejerciciosUT1;

public class Ejercicio5 {
    static void main() {

        /* EJERCICIO 5.
        Realizar un programa al que llamaremos OperadoresComparacion, que nos permita definir 4 identificadores de tipo
        entero: edadJuan, con valor 6, edadPedro, con valor 6, edadJulio, con valor 21 y contador, con valor 14; y además
        las variables de tipo decimal siguientes: hipotenusa, con valor 206,73, cateto1, con valor 13,2 y cateto2 con
        valor 5,7. El programa debe visualizar lo siguiente:
        NOTA: Para resolver el ejercicio debemos funcionar con los identificadores declarados y operadores.
        No se puede poner directamente la palabra true o false en el System.out.print().
            1. Es true que Juan es menor de edad.
            2. Es true que Juan tiene la misma edad que Pedro.
            3. Es true que Julio tiene más edad que Pedro.
            4. Es false que la hipotenusa al cuadrado es igual a la suma de sus catetos al cuadrado.
            5. Es true que el cateto1 es mayor que el cateto2.
            6. Es false que contador es igual a 8.
            7. Es true que contador es distinto a 8.
        * */
        int edadJuan = 6;
        int edadPedro = 6;
        int edadJulio = 21;
        int contador = 14;
        double hipotenusa = 206.73;
        double cateto1 = 13.2;
        double cateto2 = 5.7;

        // 1.
        System.out.println(edadJuan < 18);

        // 2.
        System.out.println(edadJuan == edadPedro);

        // 3.
        System.out.println(edadJulio > edadPedro);

        // 4.
        System.out.println((hipotenusa * 2) == (cateto1 + cateto2) * 2);

        // 5.
        System.out.println(cateto1 > cateto2);

        // 6.
        System.out.println(contador == 8);

        // 7.
        System.out.println(edadJuan != 8);







    }
}
