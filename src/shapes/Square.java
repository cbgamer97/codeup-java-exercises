package shapes;

public class Square extends Quadrilateral{

    public Square(){

    }

    public Square(double length) {
        super(length, length);
    }

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public void setWidth(double num) {

    }

    @Override
    public void setLength(double num) {
        this.length = num;
        this.width = num;
    }
}
