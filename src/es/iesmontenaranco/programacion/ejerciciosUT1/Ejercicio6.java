package es.iesmontenaranco.programacion.ejerciciosUT1;

public class Ejercicio6 {
    static void main() {

        /* EJERCICIO 6.
        Asturias tiene 1.042.000 habitantes aproximadamente, Madrid 6.464.000, y en el mundo somos 7.463.370.459.
        Realizar un programa que nos saque por pantalla la población total de Asturias y Madrid, y la población mundial.
        * */
        int habitantesAsturias = 1042000;
        int habitantesMadrid = 6464000;
        long habitantesMundo = 7463370459L;
        long habitantesTotal = habitantesAsturias + habitantesMadrid;
        System.out.println("Asturias tiene " + habitantesAsturias + " habitantes.");
        System.out.println("Madrid tiene " + habitantesMadrid + " habitantes.");
        System.out.println("La población total es: " + habitantesTotal);
        System.out.println("El mundo tiene " + habitantesMundo + " habitantes.");

    }
}
