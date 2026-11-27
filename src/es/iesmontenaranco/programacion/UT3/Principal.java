package es.iesmontenaranco.programacion.UT3;

public class Principal {
    private Ejemplo obj;

    public Principal(){
        obj = new Ejemplo();
    }


    public void run(){
        obj.imprimir();
    }


    public static void main(String[] args){

        Principal p = new Principal();
        p.run();


        Punto p1 = new Punto(cardinalidad: 'N'); //Creo un objeto de tipo Punto
        //p1.establecerX(vx: 2); //Le doy valor a la X del objeto p1
        p1.establecerY(vy: 3); //Le doy valor ala Y del objeto p1
        //Se muestra por pantalla el valor de x e y del objeto p1
        System.out.println("El valor de X en el punto p1 es: " + p1.obtenerX());
        System.out.println("El valor de Y en el punto p1 es: " + p1.obtenerY());
        System.out.println(p1.toString());
        //Crear un nuevo punto con valores (10,20) y mostrar su contenido
        /*Punto p2 = new Punto(cardinalidad: 'S');
        p2.establecerX(vx: 10);
        p2.establecerY(vx:20);
        Punto.contadorPuntos++;
        System.out.println("El valor de X en el punto p2 es: " + p2.obtenerX());
        System.out.println("El valor de Y en el punto p2 es: " + p2.obtenerY());
        // Crear un nuevo punto con valores (10,20) y mostrar su contenido
        Punto p2 = new Punto('S');
        System.out.println("El límite máximo de mi programa es: " + Constantes.LIMITE);
        */

        Rectangulo rect1 = new Rectangulo();
        System.out.println(rect1.toString());

    }

}
