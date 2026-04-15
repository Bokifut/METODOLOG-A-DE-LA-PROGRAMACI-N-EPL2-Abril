package Parte_a;

public class Ejemplo1_7_ExcepcionesComunes {

        public static void ejecutar() {
            System.out.println("Ejemplo 1.7: Clases de Excepción usadas comúnmente");

            // ArrayIndexOutOfBoundsException
            try {
                int[] anArray = new int[3];
                System.out.println(anArray[3]); // El array solo llega hasta la posición 2
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Capturada: ArrayIndexOutOfBoundsException -> Índice fuera de rango");
            }

            // NullPointerException
            try {
                String[] strs = new String[3];
                System.out.println(strs[0].length()); // strs[0] es null
            } catch (NullPointerException e) {
                System.out.println("Capturada: NullPointerException -> Intentando usar un objeto nulo");
            }

            // NumberFormatException
            try {
                Integer.parseInt("abc"); // "abc" no es un número
            } catch (NumberFormatException e) {
                System.out.println("Capturada: NumberFormatException -> Formato de número inválido");
            }

            // ClassCastException
            try {
                Object o = new Object();
                Integer i = (Integer) o; // Un Object genérico no puede convertirse directamente a Integer
            } catch (ClassCastException e) {
                System.out.println("Capturada: ClassCastException -> Tipos incompatibles");
            }

            System.out.println("Fin del Ejemplo 1.7");
        }
    }

