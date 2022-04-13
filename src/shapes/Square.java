package shapes;

public class Square extends Rectangle {
    public String side(int theSide) {
        length = theSide;
        width = theSide;
        int perim = getPerimeter(theSide, theSide);
        int area = getArea(theSide, theSide);
        return "The squares perimeter is " + perim + " and the area is " + area + " based on the integer passed...";


    }
    public int getPerimeter(int theSide){
        length = theSide;
        width = theSide;

        return 4 * theSide;
    }

    public int getArea(int theSide){
        length = theSide;
        width = theSide;

        return theSide * theSide;
    }


    public static void main(String[] args) {
        Square newSquare = new Square();
        System.out.println(newSquare.side(5));

    }

}
