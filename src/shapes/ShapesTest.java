package shapes;

public class ShapesTest extends Rectangle {
    public ShapesTest(int length, int width) {
        super(length, width);
    }

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5,4);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        Rectangle box2 = new Square(5);
        System.out.println(box2.getArea());
        System.out.println(box2.getPerimeter());

        Square sqr1 = new Square(9);
        System.out.println(sqr1.getArea());
        System.out.println(sqr1.getPerimeter());


    }

//    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle();
//        box1.length = 5;
//        box1.width = 4;
//        System.out.println(box1.getPerimeter(box1.length, box1.width));
//        System.out.println(box1.getArea(box1.length, box1.width));
//
//        Rectangle box2 = new Square();
//        System.out.println(((Square) box2).side(5));
//        System.out.println(box2.getPerimeter(box2.length, box2.width));
//        System.out.println(box2.getArea(box2.length, box2.width));
//
//        Square square = new Square();
//        System.out.println(square.side(3));
//        System.out.println(square.getArea(square.length));
//        System.out.println(square.getPerimeter(square.length));
//
//    }





}
