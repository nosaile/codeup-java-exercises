import java.util.Scanner;

public class MethodsExercises {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(addition(1, 1));
        System.out.println(subtraction(2, 1));
        System.out.println(multiplication(2, 2));
        System.out.println(division(2, 2));
//        System.out.println(getInteger(1, 10));
//        System.out.println(factorial(1, 10));
        System.out.println(rollDice());

    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }

//    public static int getInteger(int min, int max) {
//
//
//        int userInput;
//
//        System.out.println("Pick a number between 1 and 10...");
//        userInput = scanner.nextInt();
//
//
//        if (userInput < min || userInput > max) {
//            System.out.println("NO");
//            return getInteger(min, max);
//        } else {
//
//            System.out.println("goodbye");
//
//        }
//
//        return userInput;
//    }
//
//    public static long factorial(int min, int max) {
//        long result = 1;
//
//        System.out.println("Enter an integer between 1 and 10...");
//        int userEntry = scanner.nextInt();
//        if (userEntry > max || userEntry < min) {
//            System.out.println("NO");
//            return factorial(min, max);
//        }
//        for (int i = 1; i <= userEntry; i++) {
//            result *= i;
//        }
//        System.out.println(result);
//        System.out.println("Would you like to continue? ");
//        String userAnswer = scanner.next();
//        if (userAnswer.equalsIgnoreCase("y")) {
//            return factorial(min, max);
//        } else
//            System.out.println("goodbye! your final result was: ");
//        return result;
//
//
//    }

    public static int rollDice() {

        System.out.println("how many sides do you have on your dice?");
        int diceSides = scanner.nextInt();
        System.out.println("Roll your dice now.");
        int range = diceSides - 1 + 1;
        int randomNum = 0;
        int x;
        for (x = 0; x < 2; x++) {


            for (int i = 0; i < diceSides; i++) {
                randomNum = (int) (Math.random() * range) + 1;

            }
            System.out.println("Die landed on " + randomNum);
        }
        System.out.println("Do you want a re-roll? (y/n)");
        String reRoll = scanner.next();
        if (reRoll.equalsIgnoreCase("y")) {
            rollDice();
        }else
            System.out.println("okay bye...");


return 1;
    }


}








