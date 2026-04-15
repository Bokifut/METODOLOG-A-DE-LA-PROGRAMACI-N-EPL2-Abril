package Parte_b.Ejercicios1_4.Ejercicio2;

import com.google.gson.GsonBuilder;
import com.google.gson.Gson;

public class Ejercicio2Main {

        static class Author {
            String name, email;
            public Author(String name, String email) { this.name = name; this.email = email; }
        }

        static class Book {
            String title;
            Author author;
            double price;
            public Book(String title, Author author, double price) { this.title = title; this.author = author; this.price = price; }
        }

        public static void main(String[] args) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            // 1. Creamos el objeto "interno"
            Author autor = new Author("Tan Ah Teck", "tan@mail.com");

            // 2. Creamos el objeto "contenedor" que lleva el objeto interno dentro
            Book libro = new Book("Java Básico", autor, 15.99);

            System.out.println("TRANSFORMANDO OBJETO ANIDADO A JSON");

            // Transformamos el objeto Libro directamente a un String en formato JSON
            String jsonResultante = gson.toJson(libro);

            // Mostramos el resultado por consola
            System.out.println(jsonResultante);
        }
}
/*¿Qué ocurre?
No da ningún error. Lo que ocurre es que Gson representa el objeto interno (author) como un sub-nodo JSON.
Lo que se encuentra en autor queda dentro de las llaves*/