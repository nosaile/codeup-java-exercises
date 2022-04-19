import java.util.Random;

public class ServerNameGenerator {

     public static String[] adjs = {"Nice", "Funny", "Cool", "Mean", "Awesome", "Sad", "Amazing", "Rude", "Jealous", "Brilliant"};
     public static String[] nouns = {"Chicago", "New York", "Dallas", "Austin", "Obama", "Tower", "Lubbock", "Miami", "Truck", "Couch"};



     public static String randomAdjs(String[] adjs){
         int rnd = new Random().nextInt(adjs.length);
         return adjs[rnd];
     }

     public static String randomNouns(String[] nouns){
         int rnd = new Random().nextInt(nouns.length);
         return nouns[rnd];
     }

    public static void main(String[] args) {

        System.out.println(randomAdjs(adjs)+ "-" + randomNouns(nouns));

    }
}
