import java.util.Scanner;

public class HighLow {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int result = (int) (Math.random() * 100 + 1);


        for (int i = 0; i < 10; i++) {
            System.out.println("Please pick a number between 1 and 100...");
            int userInput = scanner.nextInt();

            if (userInput > result) {
                System.out.print("Number is Lower than what you guessed...");

            } else if (userInput < result) {
                System.out.print("Number is higher than what you guessed...");

            } else if (userInput == result){
                System.out.print("DING DING DING WE HAVE A WINNER!!!");
                break;
            }




        }
    }


}
