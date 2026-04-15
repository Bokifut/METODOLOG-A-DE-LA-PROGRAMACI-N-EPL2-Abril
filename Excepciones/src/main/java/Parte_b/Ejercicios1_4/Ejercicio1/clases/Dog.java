package Parte_b.Ejercicios1_4.Ejercicio1.clases;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woooof");
    }

}
