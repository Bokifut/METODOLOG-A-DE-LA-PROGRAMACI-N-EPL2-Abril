package Parte_b.Ejemplo1_3_AlmaceraYLeer.Ejercicio1_1;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        // Código añadido para ver los argumentos
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            sb.append("Argumento ").append(i).append(": ").append(args[i]).append("ln");
        }
        System.out.println("Argumentos: " + sb.toString());

        Gson gson = new Gson();
        Persona p = new Persona("Antonio Moratilla", 97);
        String json = gson.toJson(p);
        System.out.println(json);
    }

    static class Persona {
        String nombre;
        int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
    }
}
