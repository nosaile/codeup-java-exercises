package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }


    public String getString() {
        System.out.println("Continue? [y/n]");
        return scanner.nextLine();
    }

    public boolean yesNo() {
        return (getString().matches( "(?i)y|yes"));
    }

    public int getInt(int min, int max) {
        int userInt = getInt("5");
        if(userInt < max && userInt > min){
            System.out.println("Within target range, your number was");
            return userInt;


        }else
        return getInt(min, max);
    }

    public int getInt(String rand) {
        System.out.println(rand);
        try{
            return Integer.parseInt(getString());

        }catch(Exception e){
            System.out.println("Attempted return Integer.valueOf(getString()); but failed...");
            return getInt(rand);
        }



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
        try{
            return Double.parseDouble(getString());

        }catch(NumberFormatException e){
            System.out.println("DUB exception");
            return getDouble();
        }



    }



}
