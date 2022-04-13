package shapes;

import util.Input;

public class Circle {
    private Double radius;


    public Circle(double radius) {
        Input inputRadius = new Input();
        this.radius = inputRadius.getDouble();


    }

    public double getArea() {
        System.out.println("With a radius of " + this.radius + ", your area is:");
        return (Math.PI * Math.pow(radius, 2));

    }

    public double getCircumference() {
        System.out.println("With a radius of " + this.radius + ", your circumference is:");
        return (2 * Math.PI * radius);
    }
}

