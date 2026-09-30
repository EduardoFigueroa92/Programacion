

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        
        /* 1. */
        double num1 = 2.2;
        double num2 = 1.0;
        double impuesto= num1 * num2;

        System.out.println(impuesto);


        /* 2. */
        int num3 = 12;
        int num4 = 2;
        int num5 = -8;
        double impuesto2 = (num3 / num4) + num5;

        System.out.println(impuesto2);


        /* 3. */
        //Cociente es el resultado
        //Resto lo que sobra
        int num6 = 16;
        int num7 = 3;


        int cociente = num6 / num7;
        int resto = num6 % num7;
        double cocienteDecimal = num6 /num7;

        System.out.println(cociente);
        System.out.println(resto);
        System.out.println(cocienteDecimal);


        /* 4. */
        int nueve = 9;
        int postIncremento = nueve++;

        System.out.println(postIncremento);


        /* 5. */
        int preIncremento = ++nueve;
        preIncremento++;
        
        System.out.println(preIncremento);
        System.out.println("Nueve: " + nueve);


        /* 6. */
        int postDecremento = nueve--;

        System.out.println(postDecremento);
        System.out.println("Nueve: " + nueve);


        /* 7. */
        int preDecremento = --nueve;
        --preDecremento;

        System.out.println(preDecremento);
        System.out.println("Nueve: " + nueve);
        







        

       





    }
}