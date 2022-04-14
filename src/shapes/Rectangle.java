package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return this.length * 2 + this.width * 2;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public int setLength() {

        return length;
    }

    @Override
    public int setWidth() {
        return width;
    }

//    protected int length;
//    protected int width;
//
//
//
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//
//    }
//
//    public int getArea(){
//        return length*width;
//    }
//
//    public int getPerimeter(){
//        return length*2 + width *2;
//    }








}


