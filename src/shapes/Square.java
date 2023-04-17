package shapes;

public class Square extends Rectangle{

    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    public int getArea(){
        return side * side;
    }

    public int getPerimeter(){
        return 4 * side;
    }
}
