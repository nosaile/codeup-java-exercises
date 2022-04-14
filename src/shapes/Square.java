package shapes;

//
public class Square extends Rectangle {

    protected int side;

    public Square(int side) {
        super(side, side);
        this.side = side;

    }


//    public String side(int theSide) {
//        length = theSide;
//        width = theSide;
//        int perim = getPerimeter(theSide, theSide);
//        int area = getArea(theSide, theSide);
//        return "The squares perimeter is " + perim + " and the area is " + area + " based on the integer passed...";
//
//
//    }
//    public int getPerimeter(int theSide){
//
//
//
//        return 4 * theSide;
//    }
//
//    public int getArea(int theSide){
//
//
//        return theSide * theSide;
//    }
//
//
//    public static void main(String[] args) {
//        Square newSquare = new Square();
//        System.out.println(newSquare.side(5));
//
//    }

    public int getArea() {
        return side * side;
    }

    public int getPerimeter() {
        return side * 4;
    }


}
