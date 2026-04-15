package Parte_b.Ejercicios1_4.Ejercicio1.clases;

public class Employee {
    int id;
    String firstName;
    String lastName;
    int salary;

    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName= firstName;
        this.lastName=lastName;
        this.salary=salary;
    }
    public int getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getName(){
        return firstName+" "+lastName;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return salary*12;
    }
    public int raiseSalary(int percent){
        return this.salary= salary+salary*percent/100;
    }
    public String toString(){
        return "Employee[id="+id+",name="+firstName+" "+lastName+",salary="+salary+"]";
    }
}
