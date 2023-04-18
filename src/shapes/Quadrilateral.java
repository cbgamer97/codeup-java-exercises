package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{

    protected double width;
    protected double length;

    public Quadrilateral(){

    }
    public Quadrilateral(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public abstract void setWidth(double num);

    public abstract void setLength(double num);
}
