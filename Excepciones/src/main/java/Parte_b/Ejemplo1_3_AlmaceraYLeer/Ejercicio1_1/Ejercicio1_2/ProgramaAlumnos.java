package Parte_b.Ejemplo1_3_AlmaceraYLeer.Ejercicio1_1.Ejercicio1_2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramaAlumnos {

    public static void main(String[] args) {

        // Validamos que se hayan pasado al menos dos argumentos
        if (args.length < 2) {
            System.out.println("Uso incorrecto. Debe proporcionar <operacion> y <fichero>.");
            System.out.println("Ejemplo: java -jar NombreDeTuProyecto.jar init dato.json");
            System.out.println("Operaciones válidas: init, show");
            return;
        }

        String operacion = args[0];
        String rutaFichero = args[1];

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        switch (operacion.toLowerCase()) {
            case "init":
                // Crear un fichero con valores por defecto
                Alumno alumnoPorDefecto = new Alumno("Alumno de Prueba", 18, "1º DAW", 7.5);
                try (FileWriter writer = new FileWriter(rutaFichero)) {
                    gson.toJson(alumnoPorDefecto, writer);
                    System.out.println("Fichero '" + rutaFichero + "' creado con valores por defecto con éxito.");
                } catch (IOException e) {
                    System.out.println("Error al crear el fichero: " + e.getMessage());
                }
                break;

            case "show":
                // Leer un fichero y mostrar sus valores por pantalla
                try (FileReader reader = new FileReader(rutaFichero)) {
                    Alumno alumnoLeido = gson.fromJson(reader, Alumno.class);
                    if (alumnoLeido != null) {
                        System.out.println("--- DATOS DEL ALUMNO ---");
                        System.out.println("Nombre: " + alumnoLeido.getNombre());
                        System.out.println("Edad: " + alumnoLeido.getEdad());
                        System.out.println("Curso: " + alumnoLeido.getCurso());
                        System.out.println("Nota Media: " + alumnoLeido.getNotaMedia());
                        System.out.println("------------------------");
                    } else {
                        System.out.println("El fichero '" + rutaFichero + "' está vacío o el formato no es correcto.");
                    }
                } catch (IOException e) {
                    System.out.println("Error al leer el fichero. Asegúrese de que existe en la ruta: " + rutaFichero);
                }
                break;

            default:
                System.out.println("Operación '" + operacion + "' no reconocida. Use 'init' o 'show'.");
                break;
        }
    }
}
