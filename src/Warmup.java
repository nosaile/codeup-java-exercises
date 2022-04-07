public class Warmup {

    public static void main(String[] args) {
        boolean livesInCity = false;
        boolean hasTransportation = true;
        boolean canComeInPerson;


        canComeInPerson = livesInCity && hasTransportation;
        System.out.println("They can come in person is "+canComeInPerson);
    }
}
