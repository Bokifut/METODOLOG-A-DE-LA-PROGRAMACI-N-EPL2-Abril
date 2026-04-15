package Parte_a;

public class Ejemplo1_2_Pila_de_llamadas {
        public static void ejecutar() {
            System.out.println("Ejemplo 1.2: Explorando la pila de llamadas");
            System.out.println("Enter main() simulado");
            methodA();
            System.out.println("Exit main() simulado");
            System.out.println("Fin del Ejemplo 1.2");
        }

        public static void methodA() {
            System.out.println("Enter methodA()");
            methodB();
            System.out.println("Exit methodA()");
        }

        public static void methodB() {
            System.out.println("Enter methodB()");
            methodC();
            System.out.println("Exit methodB()");
        }

        public static void methodC() {
            System.out.println("Enter methodC()");
            try {
                // Provocamos el error mencionado en la práctica
                System.out.println(1/0);
            } catch (ArithmeticException e) {
                System.out.println("Excepción capturada en methodC: División por cero.");
            }
            System.out.println("Exit methodC()");
        }
    }