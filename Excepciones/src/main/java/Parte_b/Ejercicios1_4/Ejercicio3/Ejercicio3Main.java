package Parte_b.Ejercicios1_4.Ejercicio3;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
public class Ejercicio3Main {

    // Creamos una clase que contiene un array en su interior
    static class Estudiante {
            String nombre;
            String[] asignaturas; // Objeto dentro

            public Estudiante(String nombre, String[] asignaturas) {
                this.nombre = nombre;
                this.asignaturas = asignaturas;
            }
        }

        public static void main(String[] args) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            // CASO 1: Un array suelto
            String[] diasDeClase = {"Lunes", "Miércoles", "Viernes"};

            System.out.println("1. GUARDANDO UN ARRAY SIMPLE");
            String jsonArray = gson.toJson(diasDeClase);
            System.out.println(jsonArray);


            // CASO 2: Un array dentro de un objeto
            String[] asignaturasAna = {"Programación", "Matemáticas", "Física"};
            Estudiante alumna = new Estudiante("Ana", asignaturasAna);

            System.out.println("2. GUARDANDO UN OBJETO QUE CONTIENE UN ARRAY");
            String jsonObjeto = gson.toJson(alumna);
            System.out.println(jsonObjeto);
        }
    }
/*¿Qué sucede cuando quiero guardar un array?
Gson transforma automáticamente los arrays de Java en arrays de JSON.
En el formato JSON, los arrays se representan encerrando los elementos entre corchetes [] y separándolos por comas.

¿Qué sucede si el array está dentro de un objeto?
Si una clase tiene un atributo que es un array, en el JSON resultante aparecerá el nombre del atributo seguido de dos puntos :
y luego el array entre corchetes [ ] como valor de ese atributo.
*/
