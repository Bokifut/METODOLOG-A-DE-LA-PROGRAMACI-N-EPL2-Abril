package Parte_a;

public class Ejemplo1_8_TusPropiasExcepciones {
    public static void ejecutar() {
        Ejemplo1_8.ejecutar();
    }

    // Creamos nuestra propia excepción
    static class MyMagicException extends Exception {
        public MyMagicException(String message) {
            super(message);
        }
    }

    public static class Ejemplo1_8 {

        public static void magic(int number) throws MyMagicException {
            if (number == 8) {
                throw new MyMagicException("you hit the magic number");
            }
            System.out.println("hello");
        }

        public static void ejecutar() {
            System.out.println("Ejemplo 1.8: Creando nuestras propias clases de Excepciones");
            try {
                magic(9); // No lanza excepción
                magic(8); // Lanza la excepción
            } catch (MyMagicException ex) {
                System.out.println("MyMagicException: " + ex.getMessage());
            }
            System.out.println("Fin del Ejemplo 1.8");
        }
    }
}
