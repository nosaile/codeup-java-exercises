package shapes;

//
public class Square extends Quadrilateral {
    public Square(int side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }

    @Override
    public int setLength() {

        return length;
    }

    @Override
    public int setWidth() {
        return length;
    }


//    public Square(int side) {
//        super(side, side);
//
//
//    }
//
//@Override
//    public int getArea() {
//        return super.length * super.length;
//    }
//@Override
//    public int getPerimeter() {
//        return super.length * 4;
//    }


}
