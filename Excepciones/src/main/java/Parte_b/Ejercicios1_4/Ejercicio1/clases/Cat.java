package Parte_b.Ejercicios1_4.Ejercicio1.clases;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Meow");
    }
}
