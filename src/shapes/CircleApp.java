package shapes;
import util.Input;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        double getRadius = input.getDouble("Please enter the radius of a circle.");
        Circle circle = new Circle(getRadius);
        System.out.printf("The area of your circle is: %d.%n", circle.getArea(getRadius));
        System.out.printf("The circumference of your circle is: %d.%n", circle.getCircumference(getRadius));
    }
}
