package es.iesmontenaranco.programacion.ejerciciosUT1;

public class Ejercicio9 {
    static void main() {

        /* EJERCICIO 9.
        La edad de Juan son 20 años. La de Pedro una más que la de Juan, visualiza ambas edades por pantalla.
        Si Juan gana 1980 euros al mes y Pedro 800. Calcula cuánto ganan entre los dos y visualízalo por pantalla.
        Debemos utilizar los tipos de datos que mejor se ajusten a los valores que representan las constantes y variables.
        * */

        byte edadJuan = 20;
        int edadPedro = edadJuan+1;
        System.out.println("La edad de Juan es: " + edadJuan);
        System.out.println("La edad de Pedro es: " + edadPedro);

        short salarioJuan = 1980;
        short salarioPedro = 800;
        int salarioTotal = salarioJuan + salarioPedro;
        System.out.println("El salario de Juan es: " + salarioJuan);
        System.out.println("El salario de Pedro es: " + salarioPedro);
        System.out.println("El salario total es: " + salarioTotal);



}
}
