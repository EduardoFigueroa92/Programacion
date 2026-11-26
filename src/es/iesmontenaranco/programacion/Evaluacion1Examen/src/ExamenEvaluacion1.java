package es.iesmontenaranco.programacion.Evaluacion1Examen;
// EDUARDO FIGUEROA RODRÍGUEZ

/* ERRORES/MEJORAS:
   - Creación/estructura de proyecto
   - Cerrar el Scanner
   - Uso de Constantes para numeroIntentos y contraseniaCorrecta
   - Debug
* */

import java.util.Scanner;

public class ExamenEvaluacion1 {
    static void main() {

        tratarMenu();
    }

    //Desde aquí llama a mostrarMenu
    public static void tratarMenu(){

        mostrarMenu();

        Scanner teclado = new Scanner(System.in);
        System.out.println("Elige una opción del menú");
        int opcion = teclado.nextInt();

        if(opcion >= 1 && opcion <= 4){

            switch(opcion){
                case 1:
                    System.out.println("Introduce un número entero. La base");
                    int base = teclado.nextInt();
                    System.out.println("Introduce otro número entero. El exponente");
                    int exponente = teclado.nextInt();
                    calcularPotencia(base,exponente);
                    break;

                case 2:
                    validarPassword();
                    /*
                    if(contaseniaUsuario == contraseniaCorrecta){
                        System.out.println("Contraseña correcta");
                    }
                     */

                    break;

                case 3:
                    mostrarAsciiP();
                    break;

                case 4:
                    System.out.println("Fin del programa");
                    break;

            }
        }else{
            System.out.println("Introduzca una opción correcta");
            System.out.println("");

            do{
               tratarMenu();
            }while(opcion != opcion);

        }
    }


    //Solo enseña al usuario el menú
    public static void mostrarMenu(){

        System.out.println("---------- MENÚ ---------");
        System.out.println("1.- Calcular la potencia");
        System.out.println("2.- Validar contraseña");
        System.out.println("3.- Código Ascii de P");
        System.out.println("4.- Salir");
        System.out.println("");

    }


    // Método calcularPotencia
    public static void calcularPotencia(int base, int exponente){


        for (int i = 1; i <= exponente; i++){

            int resultado = (base * base) * i;
            System.out.println("El resultado de la base " + base + " elevada al exponente" + exponente + " es: " + resultado);
        }
        //System.out.println("El resultado de la base " + base + " elevada al exponente" + exponente + " es: " + resultado);
    }


    public static boolean validarPassword(){

        Scanner tecladoUsuario = new Scanner(System.in);
        System.out.println("Introduce la contraseña");
        String contraseniaUsuario = tecladoUsuario.nextLine();

        String contraseniaCorrecta = "Evaluacion1";
        int contadorIntentos = 0;

        /* No está completo. Con contraseña correcta no está ok
        y con contraseña incorrecta sólo la pide 2 veces, no 3
        * */
        if(contraseniaUsuario != contraseniaCorrecta && contadorIntentos <= 3){
            System.out.println("Vuelva a introducir la contraseña");
            tecladoUsuario.nextLine();
            contadorIntentos++;

        }else{
            System.out.println("Contraseña correcta");
        }

        return true;

    }


    public static void mostrarAsciiP(){
        char LETRA = 'P';
        System.out.println("El código ascii de " + LETRA + " es: " + LETRA);
    }













    }
