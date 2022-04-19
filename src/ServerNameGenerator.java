import java.util.Random;

public class ServerNameGenerator {

     public static String[] adjs = {"Nice", "Funny", "Cool", "Mean", "Awesome", "Sad", "Amazing", "Rude", "Jealous", "Brilliant"};
     public static String[] nouns = {"Car", "Motorboat", "Statue", "Deck", "Cannon", "Tower", "Guardrail", "Cup", "Truck", "Couch"};



     public static String randomWords(String[] array){
         int rnd = new Random().nextInt(array.length);
         return array[rnd];
     }


    public static void main(String[] args) {

        System.out.println("Here is your server name:\n"+randomWords(adjs)+ "-" + randomWords(nouns));

    }
}
