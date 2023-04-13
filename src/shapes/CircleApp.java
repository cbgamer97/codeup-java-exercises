package shapes;
import util.Input;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle1 = new Circle();
        double getRadius = Input.getDouble(1, 10);
        double area = circle1.getArea(getRadius);
        double circumference = circle1.getCircumference(getRadius);
        System.out.println(area);
        System.out.println(circumference);
    }
}
