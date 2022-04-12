public class MyCouch {
//    public static String type;
//
//    public static void main(String[] args) {
//        explainCouch();
//
//    }
//    private static void explainCouch(){
//        MyCouch.type = "leather";
//        System.out.println("This couch is a, " + MyCouch.type + " couch.");
//    }
    private String type;
    private int numSeats;

    public MyCouch(String type, int numSeats){
        this.type = type;
        this.numSeats = numSeats;
    }

    public int getNumSeats(){
        return this.numSeats;
    }
    public void setNumSeats(int numSeats){
        this.numSeats = numSeats;
    }

    public String getType(){
        return this.type;
    }
    public void setType(String type){
        this.type = type;
    }

}
