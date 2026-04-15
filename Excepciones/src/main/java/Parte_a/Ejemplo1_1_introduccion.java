package Parte_a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejemplo1_1_introduccion {
        public static void ejecutar() {
            System.out.println("Ejemplo 1.1: Introducción a Excepciones");
            try {
                // Lógica principal separada del manejo de errores
                Scanner in = new Scanner(new File("test.in"));
                System.out.println("Archivo test.in abierto correctamente.");
            } catch (FileNotFoundException ex) {
                // Manejo de errores separado de la lógica principal
                System.out.println("Excepción capturada: El archivo no existe.");
            }
            System.out.println("Fin del Ejemplo 1.1");
        }
    }
