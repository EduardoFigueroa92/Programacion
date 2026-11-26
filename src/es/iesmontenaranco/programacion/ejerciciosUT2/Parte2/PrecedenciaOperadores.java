package es.iesmontenaranco.programacion.ejerciciosUT2.Parte2;

public class PrecedenciaOperadores {
    static void main() {
        int alfa = 5, beta = 10, gamma = 2, delta = 8;
        boolean sigma = true; boolean tau = false;
        int prioridad = alfa + beta + gamma - delta / 2 + (alfa % gamma) * 3;
        System.out.println("Resultado de la expresión compleja: " + prioridad);
        boolean logico = sigma && tau || !sigma && (beta > alfa) || (gamma + delta < beta * 2);
        System.out.println("Resultado de expresión lógica compleja: " + logico);
        int mayor = (alfa > beta) ? alfa : (beta > gamma + delta ? beta : gamma + delta);
        System.out.println("Máximo con ternari complejo: " + mayor);

        //prioridad = 5 + 10 * 2 - 8 / 2 + (5 % 2) * 3
        // 1.- (5 % 2) = 1 -> 5 + 10 * 2 -8 / 2 + 1 * 3
        // 2.- evaluamos * / * -> 5 + 20 - 4 + 3
        // 3.- evaliamos + - + -> 25 - 4 + 3 -> 21 + 3 -> 24

        //logico = true && false || !true && (10 > 5) || (2 + 8 < 10 * 2)
        // 1.- evaluamos () -> true && false || !true && true || (10 < 20)
        //                  -> true && false || !true && true || true
        // 2.- evaluamos !  -> true && false || false && true || true
        // 3.- evaluamos && -> false || false ||  true
        // 4.- evaluamos || -> false || true -> true

        //mayor = 5 > 10 si es verdad 5, si es falso (10 > 2 + 8 si es verdad 10, sino 2 + 8
        //mayor (5 > 10) ? 5 : (10 > 2 + 8 ? 10 : 2 + 8) -> condicion = false
        // 1.- evaluamos (5 > 10) = false -> (10 > 2 + 8 ? 10 : 2 + 8)
        // 2.- evaluamos (10 > 10) = false -> 2 + 8 = 10





    }
}
