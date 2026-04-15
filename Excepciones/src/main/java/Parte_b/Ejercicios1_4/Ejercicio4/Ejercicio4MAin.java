package Parte_b.Ejercicios1_4.Ejercicio4;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
public class Ejercicio4MAin {
    // clase estudiante
    static class Estudiante {
        String nombre;
        int matricula;

        public Estudiante(String nombre, int matricula) {
            this.nombre = nombre;
            this.matricula = matricula;
        }

        @Override
        public String toString() {
            return "Estudiante[nombre=" + nombre + ", matricula=" + matricula + "]";
        }
    }

    //Clase asignatura
    static class Asignatura {
        String nombreAsignatura;
        List<Estudiante> estudiantes; // Aquí está la lista de estudiantes

        public Asignatura(String nombreAsignatura) {
            this.nombreAsignatura = nombreAsignatura;
            this.estudiantes = new ArrayList<>(); // Inicializamos la lista vacía
        }

        public void agregarEstudiante(Estudiante e) {
            this.estudiantes.add(e);
        }

        @Override
        public String toString() {
            return "Asignatura: " + nombreAsignatura + " Alumnos: " + estudiantes;
        }
    }

    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // 1. Creamos la asignatura y los alumnos
        Asignatura metodologia = new Asignatura("Metodología de la Programación");
        metodologia.agregarEstudiante(new Estudiante("Ana", 101));
        metodologia.agregarEstudiante(new Estudiante("Luis", 102));

        // 2. Transformamos a JSON
        System.out.println("1.Estructura del fichero resultante");
        String jsonResultante = gson.toJson(metodologia);
        System.out.println(jsonResultante);

        // 3. Cargamos el JSON de vuelta a objetos Java
        System.out.println("2. cargando el json de vuelta ");
        Asignatura asignaturaCargada = gson.fromJson(jsonResultante, Asignatura.class);
        System.out.println(asignaturaCargada.toString());
    }
}
/*¿Qué estructura tiene el fichero resultante?
Una estructura formada por objetos y arrays
¿Puedo modificar los alumnos en el fichero resultante, y obtener unos nuevos objetos cargando el fichero de vuelta?
Sí
 */