package Parte_b.Ejercicios1_4.Ejercicio1;

import Parte_b.Ejercicios1_4.Ejercicio1.clases.*;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1Main {

    public static void main(String[] args) {
        Gson gson = new Gson();

        // Práctica A
        Circle circulo = new Circle(2.5, "Rojo");
        Employee empleado = new Employee(101, "Ana", "Gómez",10000);

        // Práctica B
        Author autor = new Author("Tan Ah Teck", "tan@mail.com");
        Book libro = new Book("12345","Java Básico", autor, 15.99);

        // Práctica C
        Person persona = new Person("Juan", "Calle Mayor 12");
        Student estudiante = new Student("Luis", "Av. Central", "Informática",2023,1500.50);

        // Práctica D
        Dog perro = new Dog("Toby");
        Cat gato = new Cat("Miau");

        // Guardando en Json
        System.out.println("Guardando objetos");
        guardarObjeto("circle.json", circulo, gson);
        guardarObjeto("employee.json", empleado, gson);
        guardarObjeto("author.json", autor, gson);
        guardarObjeto("book.json", libro, gson);
        guardarObjeto("person.json", persona, gson);
        guardarObjeto("student.json", estudiante, gson);
        guardarObjeto("dog.json", perro, gson);
        guardarObjeto("cat.json", gato, gson);

        // cargar objetos desde Json y mostrarlos por consola
        System.out.println("recuperando objetos");
        System.out.println(cargarObjeto("circle.json", Circle.class, gson));
        System.out.println(cargarObjeto("employee.json", Employee.class, gson));
        System.out.println(cargarObjeto("author.json", Author.class, gson));
        System.out.println(cargarObjeto("book.json", Book.class, gson));
        System.out.println(cargarObjeto("person.json", Person.class, gson));
        System.out.println(cargarObjeto("student.json", Student.class, gson));
        System.out.println(cargarObjeto("dog.json", Dog.class, gson));
        System.out.println(cargarObjeto("cat.json", Cat.class, gson));
    }

    // Métodos auxiliares para no repetir código
    private static void guardarObjeto(String archivo, Object objeto, Gson gson) {
        try (FileWriter writer = new FileWriter(archivo)) {
            gson.toJson(objeto, writer);
            System.out.println("Guardado: " + archivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static <T> T cargarObjeto(String archivo, Class<T> clase, Gson gson) {
        try (FileReader reader = new FileReader(archivo)) {
            return gson.fromJson(reader, clase);
        } catch (IOException e) {
            return null;
        }
    }
}

