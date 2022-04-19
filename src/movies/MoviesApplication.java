package movies;

import util.Input;

public class MoviesApplication {


    public static void main(String[] args) {
        Input userResponse = new Input();
        int choice;
        Movie[] movies = MoviesArray.findAll();
        do {
            System.out.println("Please select one of the following options...\n1: view all movies\n2: view animated movies\n3: view drama movies\n4: view horror movies\n5: view sci-fi movies\n6: view musical movies\n7: exit");
            choice = userResponse.getInt("Enter a choice...");
            if (choice == 1) {
                for (int i = 0; i < movies.length; i++) {
                    System.out.println(movies[i].getName() + " --- " + movies[i].getCategory());

                }
            } else if (choice == 2) {
                for (int i = 0; i < movies.length; i++) {
                    movies[i].setCategory("animated");
                    System.out.println(movies[i].getName() + " --- " + movies[i].getCategory());
                }
            } else if (choice == 3) {
                for (int i = 0; i < movies.length; i++) {
                    movies[i].setCategory("drama");
                    System.out.println(movies[i].getName() + " --- " + movies[i].getCategory());
                }
            } else if (choice == 4) {
                for (int i = 0; i < movies.length; i++) {
                    movies[i].setCategory("horror");
                    System.out.println(movies[i].getName() + " --- " + movies[i].getCategory());
                }
            } else if (choice == 5) {
                for (int i = 0; i < movies.length; i++) {
                    movies[i].setCategory("sci-fi");
                    System.out.println(movies[i].getName() + " --- " + movies[i].getCategory());
                }
            } else if (choice == 6) {
                for (int i = 0; i < movies.length; i++) {
                    movies[i].setCategory("musical");
                    System.out.println(movies[i].getName() + " --- " + movies[i].getCategory());
                }
            } else {
                System.out.println("Good-bye!");
            }
        } while (choice != 7);
    }
}