import java.util.Scanner;

public class HighLow {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print(userEntry());
    }

    public static int randNum() {
//
        return (int) (Math.random() * 100 + 1);

    }

    public static String userEntry() {
        System.out.println("Please pick a number between 1 and 100...");
        int userInput = scanner.nextInt();
        if (userInput > randNum()){
            System.out.print("Number is Lower than what you guessed...");
            userEntry();
        }else if (userInput < randNum()){
            System.out.print("Number is higher than what you guessed...");
            userEntry();
        }else {
            System.out.print("DING DING DING WE HAVE A WINNER!!!");
        }



        return null;
    }
}
