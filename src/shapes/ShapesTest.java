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

        Square sqr1 = new Square(3);
        System.out.println(sqr1.getArea());
        System.out.println(sqr1.getPerimeter());


    }







}
