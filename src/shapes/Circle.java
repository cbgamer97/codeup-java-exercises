package shapes;

import java.util.Scanner;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(double radius){
        return Math.PI * (radius * radius);
    }
    public double getCircumference(double radius){
        return 2 * Math.PI * radius;
    }
}
