package Parte_b.Ejemplo1_3_AlmaceraYLeer.Ejercicio1_1;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GsonUtilEjemplo {

    public static <T> void guardarObjetoEnArchivo(String rutaArchivo, T objeto) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(objeto, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> T cargarObjetoDesdeArchivo(String rutaArchivo, Class<T> clase) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(rutaArchivo)) {
            return gson.fromJson(reader, clase);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {

        // En este nuevo main NO guardamos el objeto, SOLO lo leemos
        String rutaArchivo = "usuario.json";

        // Cargar el objeto Usuario desde el archivo JSON
        Usuario usuarioCargado = cargarObjetoDesdeArchivo(rutaArchivo, Usuario.class);
        
        if (usuarioCargado != null) {
            System.out.println("Usuario cargado:");
            System.out.println("Nombre: " + usuarioCargado.nombre);
            System.out.println("Edad: " + usuarioCargado.edad);
            System.out.println("Correo: " + usuarioCargado.correo);
        }
    }

    // Clase Usuario para los ejemplos
    static class Usuario {
        String nombre;
        int edad;
        String correo;

        public Usuario(String nombre, int edad, String correo) {
            this.nombre = nombre;
            this.edad = edad;
            this.correo = correo;
        }
        // Getters y setters no incluidos por brevedad
    }
}

/*¿Sabrías explicar por qué se usa y qué está pasando?
Se Usa tanto para que puedas usarlo directamente, sin tener que crear un objeto previamente.
 */

/*Pregunta: ¿Dónde se guarda el fichero de datos?

Como en el código solo se especifica el nombre del archivo sin ninguna ruta absoluta,
se guarda en el directorio del proyecto en IntelliJ
*/