package Parte_b.Ejemplo1_3_AlmaceraYLeer.Ejercicio1_1.Ejercicio1_2;

public class Alumno {
    private String nombre;
    private int edad;
    private String curso;
    private double notaMedia;

    public Alumno(String nombre, int edad, String curso, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        this.notaMedia = notaMedia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCurso() {
        return curso;
    }

    public double getNotaMedia() {
        return notaMedia;
    }
}
