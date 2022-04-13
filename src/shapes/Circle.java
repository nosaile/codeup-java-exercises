package shapes;

import util.Input;

public class Circle {
    private Double radius;


    public Circle(double radius) {
        Input inputRadius = new Input();
        inputRadius.getDouble();
        this.radius = inputRadius.getDouble();


    }

    public double getArea() {
        return (Math.PI * Math.pow(radius, 2));
    }

    public double getCircumference() {
        return (2 * Math.PI * radius);
    }
}
