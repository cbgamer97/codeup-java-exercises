package shapes;

public class Square extends Quadrilateral{
    public Square(int side) {
        super(side, side);
    }

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


    //
//    public int getSide() {
//        return side;
//    }
//
//    public void setSide(int side) {
//        this.side = side;
//    }
//
//    public Square(int side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    public int getArea(){
//        return side * side;
//    }
//
//    public int getPerimeter(){
//        return 4 * side;
//    }
}
