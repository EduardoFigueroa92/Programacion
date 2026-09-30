import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        System.out.println("Introduce tu nombre");
        Scanner s = new Scanner(System.in);

        String nombre = s.nextLine();   
        System.out.println("Hola " + nombre);
   

        /**
         * System.out.println("Introduce tu nombre");
         * Scanner s = new Scanner(System.in);
         * String nombre = s.nextLine();
         * 
         * System.out.println("Introduce tu edad");
         * int edad = s.nextLine();
         * 
         * System.out.println("Introduce la ciudad donde vives");
         * String ciudad = s.nextLine();
         * 
         * System.out.println("Hola " + nombre + ", tienes " + edad + " años" + ". Y vives en" + ciudad):
         * 
        */

        /*
          System.out.println("Introduce tu nombre");

          Scanner s = new Scanner(System.in);
          String nombre = s.nextLine();
          
          System.out.println("Introduce tu edad");
          int edad = s.nextInt();
          s.nextLine();//Se pone para limpiar el Enter sobrante
         
          System.out.println("Introduce la ciudad donde vives");
          String ciudad = s.nextLine();
          
          System.out.println("Hola " + nombre + ", tienes " + edad + " años," + " y vives en " + ciudad);
          */
    }

}
