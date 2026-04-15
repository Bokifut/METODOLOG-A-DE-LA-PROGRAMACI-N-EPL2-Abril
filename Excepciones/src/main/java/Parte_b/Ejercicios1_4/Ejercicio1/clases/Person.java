package Parte_b.Ejercicios1_4.Ejercicio1.clases;

public class Person {
    private String name;
    private String address;
//Crear Persona
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
//Getters y Setters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
//Descripción
    @Override
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
}
