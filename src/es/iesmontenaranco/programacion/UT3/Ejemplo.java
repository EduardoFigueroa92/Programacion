package es.iesmontenaranco.programacion.UT3;

public class Ejemplo {
    private static int numero; //atributo estatico
    private int num = 0; // atributo de la instancia

    public static boolean esPar(){ //metodo de la clase o estatico
        Ejemplo.numero = 10;
        return true;
    }

    public static void incrementar(){ //metodo de la clase
        //this.num; -> da error porque no es un atributo estatico o de la clase
        //this.imprimir() -> da error porque no es un metodo estatico
        Ejemplo.esPar();
        //num++;
        //this se usa para acceder a los elementos de la misma clase
    }

    public void imprimir(){
        System.out.println(num);
    }
        //Sin embargo, desde un metodo que no sea estatico se puede acceder a un atributo/metodo que sea estatico
        System.out.println(this.num);
}
