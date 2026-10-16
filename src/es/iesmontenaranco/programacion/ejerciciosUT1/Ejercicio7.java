package es.iesmontenaranco.programacion.ejerciciosUT1;

public class Ejercicio7 {
    static void main() {

        /* EJERCICIO 7.
            1. Suponiendo que un bollo de pan nos cuesta 0,87 céntimos y un kilo de queso 13,10 euros.
                Visualizar por pantalla cuánto debo pagar por un bocadillo que contiene 150 gramos de queso.
            2. Visualiza por pantalla el siguiente mensaje: Tenemos en clase una invasión de hormigas,
                concretamente (el valor que debes asignar al identificador es: 6*10 elevado a 100).
        * */

        // 1.
        double precioBollo = 0.87;
        double kiloQueso = 13.10;
        double precioGramos = (150 * kiloQueso) / 1000;
        double precioBolloConQueso = precioBollo + precioGramos;
        System.out.println("El precio del bocadillo con 150 gr de queso es: " +precioBolloConQueso);

        // 2.




    }
}
