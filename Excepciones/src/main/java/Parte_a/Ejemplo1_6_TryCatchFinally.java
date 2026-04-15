package Parte_a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

    public class Ejemplo1_6_TryCatchFinally {
        public static void ejecutar() {
            System.out.println("Ejemplo 1.6: try-catch-finally");
            try {
                System.out.println("Start of the main logic");
                System.out.println("Try opening a file ...");
                Scanner in = new Scanner(new File("test.in"));
                System.out.println("File Found, processing the file...");
                System.out.println("End of the main logic");
            } catch (FileNotFoundException ex) {
                System.out.println("File Not Found caught...");
            } finally {
                System.out.println("finally-block runs regardless of the state of exception");
            }
            System.out.println("After try-catch-finally, life goes on...");
            System.out.println("Fin del Ejemplo 1.6");
        }
    }
