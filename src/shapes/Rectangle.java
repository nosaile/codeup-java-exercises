package shapes;

public class Rectangle {

    protected int length;
    protected int width;


    public int getPerimeter(int length, int width){
        int pL = (length * 2);
        int pW =(width * 2);

        return pL + pW;
    }

    public int getArea(int length, int width){
        return length * width;
    }



    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1.getPerimeter(5, 2) + " is the perimeter.");
        System.out.println(rectangle1.getArea(5,2) + " is the area");
    }



}


