package es.iesmontenaranco.programacion.UT3;

public class Punto { //Cabecera de la clase
    //Cuerpo de la clase
    //Atributos
    private int x, y;
    private final char CARDINALIDAD;
    public static int contadorPuntos; //Atributo de la clase
    private final float PI = 3.14f; //Declaracion e inicializacion del atributo final
    //Constructores
    //Constructor por defecto
    public Punto(char cardinalidad){
        CARDINALIDAD = cardinalidad;
    }
    // - Constructor con todos los atributos como parámetros
    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Punto(int x, int y, char puntoCardinal){
        this.x = x;
        this.y = y;
        this.CARDINALIDAD = puntoCardinal;
    }
    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getContadorPuntos(){
        return Punto.contadorPuntos;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void setContadorPuntos(int contador){
        Punto.contadorPuntos = contador;
    }

    public String toString(){
        System.out.println("El valor de las coordenadas del punto son: x = " + this.x+ "; y= " + this.y);
    }

    //Métodos
    public int obtenerX(){
        return this.x;
    }
    public int obtenerY(){
        return this.y;
    }
    public void establecerX(int vx){
        this.x = vx;
    }
    public void establecerY(int vy){
        this.y = Constantes.Base_2;
    }



}
