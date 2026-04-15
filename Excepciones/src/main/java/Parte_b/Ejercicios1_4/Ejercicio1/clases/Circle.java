package Parte_b.Ejercicios1_4.Ejercicio1.clases;

public class Circle {// Save as "Circle.java"
    // variable privada, not accessible from outside this class
    private double radius;
    private String color;

    // Constructors (overloaded)
    /** construye un circulo con un radio y colo predeterminado*/
    public Circle() { // 1st (default) constructor
        radius = 1.0;
        color = "red";
    }

    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r) { // 2nd constructor
        radius = r;
        color = "red";
    }

    // 3rd constructor to construct a new instance of Circle with the given radius and color
    public Circle(double r, String c) {
        radius= r;
        color = c;
    }
    // Getter for instance variable color
    public String getColor() {
        return color;
    }
    // Setter for instance variable radius
    public void setRadius(double newRadius) {
        this.radius = newRadius;       // "this.radius" refers to the instance variable
                                    // "radius" refers to the method's argument
    }
    // Setter for instance variable color
    public void setColor(String newColor) {
        this.color = newColor;
    }

    /** Returns the radius */
    public double getRadius() {
        return radius;
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius*radius*Math.PI;
    }
    /** Return a self-descriptive string of this instance in the form of Circle[radius=?,color=?] */
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}

