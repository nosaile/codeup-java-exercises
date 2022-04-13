package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }


    public String getString() {
        System.out.println("Do you say yes or no?");
        return scanner.nextLine();
    }

    public boolean yesNo() {
        return (getString().matches( "(?i)y|yes"));
    }

    public int getInt(int min, int max) {
        int userInt = getInt();
        if(userInt < max && userInt > min){
            System.out.println("Within target range, your number was");
            return userInt;


        }else
        return getInt(min, max);
    }

    public int getInt() {
        System.out.println("Give me an number...");

        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double userDouble = getDouble();
        if(userDouble < max && userDouble > min){
            System.out.println("Within target range, your number was");
            return userDouble;


        }else
        return getDouble(min, max);
    }

    public double getDouble() {
        System.out.println("Give me a number...");

        return scanner.nextDouble();
    }



}
