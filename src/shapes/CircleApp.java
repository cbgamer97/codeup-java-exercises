package shapes;
import util.Input;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        Scanner scanner = new Scanner(System.in);
        Circle circle1 = new Circle();
        double getRadius = input.getDouble(1, 10);
        double area = circle1.getArea(getRadius);
        double circumference = circle1.getCircumference(getRadius);
        System.out.println(area);
        System.out.println(circumference);
    }
}
