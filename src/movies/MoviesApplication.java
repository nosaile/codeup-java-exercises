package movies;

import util.Input;

public class MoviesApplication {

public static void filterMovie(){
    Input userResponse = new Input();
    int choice = 0;
    Movie[] newMovie = MoviesArray.findAll();
    do {
        System.out.println("Please select one of the following options...\n" +
                "1: view all movies\n" +
                "2: view animated movies\n" +
                "3: view drama movies\n" +
                "4: view horror movies\n" +
                "5: view sci-fi movies\n" +
                "6: view musical movies\n" +
                "7: exit");
        choice = userResponse.getInt("Enter a choice...");
        if (choice == 1) {
            for (int i = 0; i < newMovie.length; i++) {
                System.out.println(newMovie[i].getName() + " --- " + newMovie[i].getCategory());

            }
        } else if (choice == 2) {
            for (int i = 0; i < newMovie.length; i++) {
                if (newMovie[i].getCategory() == "animated") {
                    System.out.println(newMovie[i].getName() + " --- " + newMovie[i].getCategory());
                }
            }
        } else if (choice == 3) {
            for (int i = 0; i < newMovie.length; i++) {
                if (newMovie[i].getCategory() == "drama") {
                    System.out.println(newMovie[i].getName() + " --- " + newMovie[i].getCategory());
                }
            }
        } else if (choice == 4) {
            for (int i = 0; i < newMovie.length; i++) {
                if (newMovie[i].getCategory() == "horror") {
                    System.out.println(newMovie[i].getName() + " --- " + newMovie[i].getCategory());
                }
            }
        } else if (choice == 5) {
            for (int i = 0; i < newMovie.length; i++) {
                if (newMovie[i].getCategory() == "sci-fi") {
                    System.out.println(newMovie[i].getName() + " --- " + newMovie[i].getCategory());
                }
            }
        } else if (choice == 6) {
            for (int i = 0; i < newMovie.length; i++) {
                if (newMovie[i].getCategory() == "musical") {
                    System.out.println(newMovie[i].getName() + " --- " + newMovie[i].getCategory());
                }
            }
        } else {
            System.out.println("Good-bye!");
        }
    } while (choice != 7);
}



//doesnt work
//    public static void filterMovie(){
//        Input userResponse = new Input();
//        int choice;
//        Movie[] newMovie = MoviesArray.findAll();
//        boolean continueToRun = true;
//        do {
//            System.out.println("Please select one of the following options...\n1: view all movies\n2: view animated movies\n3: view drama movies\n4: view horror movies\n5: view sci-fi movies\n6: view musical movies\n7: exit");
//            choice = userResponse.getInt("Enter a choice...");
//            switch (choice) {
//                case (1): {
//                    for (int i = 0; i < newMovie.length; i++) {
//                        System.out.println(newMovie[i].getName() + " --- " + newMovie[i].getCategory());
//continue;
//                    }
//                } case (2) :{
//                    for (int i = 0; i < newMovie.length; i++) {
//                        if (newMovie[i].getCategory() == "animated") {
//                            System.out.println(newMovie[i].getName() + " --- " + newMovie[i].getCategory());
//continue;
//                        }
//                    }
//                } case  (3): {
//                    for (int i = 0; i < newMovie.length; i++) {
//                        if (newMovie[i].getCategory() == "drama") {
//                            System.out.println(newMovie[i].getName() + " --- " + newMovie[i].getCategory());
//continue;
//                        }
//                    }
//                } case (4) :{
//                    for (int i = 0; i < newMovie.length; i++) {
//                        if (newMovie[i].getCategory() == "horror") {
//                            System.out.println(newMovie[i].getName() + " --- " + newMovie[i].getCategory());
//continue;
//                        }
//                    }
//                } case (5) :{
//                    for (int i = 0; i < newMovie.length; i++) {
//                        if (newMovie[i].getCategory() == "sci-fi") {
//                            System.out.println(newMovie[i].getName() + " --- " + newMovie[i].getCategory());
//continue;
//                        }
//                    }
//                } case (6): {
//                    for (int i = 0; i < newMovie.length; i++) {
//                        if (newMovie[i].getCategory() == "musical") {
//                            System.out.println(newMovie[i].getName() + " --- " + newMovie[i].getCategory());
//                            continue;
//                        }
//                    }
//                } case (7): {
//                    System.out.println("Good-bye!");
//                    continueToRun = false;
//                    break;
//                }
//            } } while (continueToRun);
//    }

    public static void main(String[] args) {
        filterMovie();

    }
}