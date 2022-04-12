package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }


    public String getString() {
        return null;
    }

    public boolean yesNo() {
        System.out.println("Do you say yes or no?");
        String userAnswer = scanner.nextLine();
        if (userAnswer.equalsIgnoreCase("y") || userAnswer.equalsIgnoreCase("yes")) {
            return true;
        } else
            return false;
    }

    public int getInt(int min, int max) {
        System.out.println("Give me an integer within the range of the min and max...");
        int userInt = scanner.nextInt();
        if(userInt < max && userInt > min){
            System.out.println("Within target range, your number was");
            return userInt;


        }else
        return getInt(min, max);
    }

    public int getInt() {

        return 0;
    }

    public double getDouble(double min, double max) {
        System.out.println("Give me an decimal within the range of the min and max...");
        double userDouble = scanner.nextDouble();
        if(userDouble < max && userDouble > min){
            System.out.println("Within target range, your number was");
            return userDouble;


        }else
        return getDouble(min, max);
    }

    public double getDouble() {

        return 0;
    }



}
