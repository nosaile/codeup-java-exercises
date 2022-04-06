import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

//        double pi = 3.14159;
//
//        String approxPI = "The value of pi is approximately, ";
//
//        System.out.format(approxPI + "%3.2f%n", pi);

//        System.out.println("whats your name");
//        String name = scanner.nextLine();
//        System.out.println("where are you from?");
//        String location = scanner.nextLine();
//        System.out.printf("Nice to meet you %s, %s sounds like a nice place!", name, location);


        System.out.println("Enter any integer.");
        String integer = String.valueOf(scanner.nextInt());
        System.out.printf("You picked %s!%n", integer);

        System.out.println("Enter a word...");
        scanner.nextLine();
        String word = scanner.nextLine();
        System.out.println("Now again...");
        String word2 = scanner.nextLine();
        System.out.println("And one more time...");
        String word3 = scanner.nextLine();
        System.out.printf("%s%n%s%n%s%n", word, word2, word3);

        System.out.println("Enter a sentence...");
        String sentence = scanner.nextLine();
        System.out.printf("%s%n", sentence);

        System.out.println("Enter the width of the room you are currently in...");
        int width = parseInt(scanner.nextLine());
        System.out.println("Enter the length of the room you are currently in...");
        int length = parseInt(scanner.nextLine());
        System.out.printf("%d is the perimeter and %d is the area.",Math.addExact(width*2, length*2), Math.multiplyExact(width, length));












    }
}
