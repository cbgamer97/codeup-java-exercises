package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        super(width, length);
    }

    @Override
    public double getPerimeter() {
        return 2 * width + 2 * length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setWidth(double num) {
        this.width = num;
    }

    @Override
    public void setLength(double num) {
        this.length = num;
    }
}
