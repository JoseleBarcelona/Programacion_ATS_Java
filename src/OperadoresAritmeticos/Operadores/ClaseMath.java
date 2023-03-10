package OperadoresAritmeticos;

public class ClaseMath {
    /*
    //Math. es una Clase de la librería de Java, en la cual encuentras múltiples
    funciones matemáticas, sólo tienes que instanciarlas.
     */
    public static void main(String[] args) {
        double raizCuadrada = Math.sqrt(9);
        System.out.println(raizCuadrada);

        double base= 5, exponente = 2; //5 elevado a 2 es 5 * 5 = 25
        double resultado = Math.pow(base, exponente);
        System.out.println(resultado);

        double numero = 4.56; //redondeo
        long resultado1 = Math.round(numero);
        System.out.println(resultado1);

        double numero1 = Math.random();//da un número aleatorio
        System.out.println(numero1);
    }
}
