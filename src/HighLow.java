import java.util.Scanner;

public class HighLow {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int result = (int) (Math.random() * 100 + 1);

        System.out.println("Please pick a number between 1 and 100...");
        for (int i = 1; i < 11; i++) {
            int userInput = scanner.nextInt();

            if (userInput > result) {
                System.out.print("Number is Lower than "+ userInput + ", please choose again...");

            } else if (userInput < result) {
                System.out.print("Number is higher than "+ userInput + ", please choose again...");

            } else {
                System.out.print("DING DING DING WE HAVE A WINNER!!! "+ result + " was the correct number!");
                break;
            }

            System.out.println("This was attempt number: " + i + " out of 10.");


        }
    }


}
