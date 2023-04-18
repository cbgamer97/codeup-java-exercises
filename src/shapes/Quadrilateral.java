package shapes;

abstract class Quadrilateral extends Shape implements Measurable{

    protected int width;
    protected int length;

    public int getWidth() {
        return width;
    }

    public abstract int setWidth();

    public int getLength() {
        return length;
    }

    public abstract int setLength();

    public Quadrilateral(){

    }

    public Quadrilateral(int width, int length) {
        this.width = width;
        this.length = length;
    }
}
