package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public int setWidth() {
        return 0;
    }

    @Override
    public int setLength() {
        return 0;
    }

//    protected int length;
//    protected int width;
//
//    public Rectangle(){
//
//    }
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public int getPerimeter(){
//        return 2 * length + 2 * width;
//    }
//
//    public int getArea() {
//        return length * width;
//    }
}
