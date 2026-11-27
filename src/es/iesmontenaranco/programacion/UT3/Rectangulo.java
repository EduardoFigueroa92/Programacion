package es.iesmontenaranco.programacion.UT3;

public class Rectangulo {

    // Por norma general los atributos de la clase son privados
    // Atributos
    private int x;
    private int y;
    private int alto;
    private int ancho;

    // Constructor por defecto que inicializa los atributos con su valor por defecto (en funcion de su tipo)
    public Rectangulo(){
        /*this.x = 0;
        this.y = 0;
        this.alto = 0;
        this.ancho = 0;*/
        this(0,0,0,0);
        // Es el valor por defecto que asigna Java a los enteros
    }

    // Constructor con todos los parámetros que inicializa los atributos
    public Rectangulo(int x, int y, int alto, int ancho){
        this.x = x;
        this.y = y;
        this.ancho = alto;
        this.alto = ancho;
    }

    //Constructor con parte de los parametros (alto, ancho)
    public Rectangulo(int alto, int ancho){
        /*this.x = 0;
        this.y = 0;
        this.alto = alto;
        this.ancho = ancho;*/
        this(0,0, alto, ancho);
    }

    /* ESTO NO SE PUEDE HACER
    public void run(){
        Rectangulo();
    }
     */

    // GETTERS
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public int getAlto(){
        return this.alto;
    }
    public int getAncho(){
        return this.ancho;
    }


    // SETTERS
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setAlto(int alto){
        this.alto = alto;
    }
    public void setAncho(int ancho){
        this.ancho = ancho;
    }


    // TOSTRING
    public String toString(){
        return "Los datos del rectangulo son: x = " + this.x + "; y = " + this.y + "; alto = " + this.alto + "; ancho = "+ this.ancho;
    }







}

