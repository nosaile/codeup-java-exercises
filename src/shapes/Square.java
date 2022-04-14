package shapes;

//
public class Square extends Rectangle {



    public Square(int side) {
        super(side, side);


    }

@Override
    public int getArea() {
        return super.length * super.length;
    }
@Override
    public int getPerimeter() {
        return super.length * 4;
    }


}
