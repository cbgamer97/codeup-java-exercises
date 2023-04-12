package shapes;

import java.util.Scanner;

public class Circle {
    private static double radius;



    public static double getRadius() {
        return radius;
    }

    public static void setRadius(double radius) {
        Circle.radius = radius;
    }
    public Circle() {

    }

    public double getArea(double radius){
        return Math.PI * (radius * radius);
    }
    public double getCircumference(double radius){
        return 2 * Math.PI * radius;
    }
}
