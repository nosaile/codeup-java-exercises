package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected int length;
    protected int width;

    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength(int length){
        this.length = length;
        return length;
    }

    public int getWidth(int width){
       this.width = width;
        return width;
    }

    public abstract int setLength();

    public abstract int setWidth();




}
