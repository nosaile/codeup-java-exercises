import java.util.Scanner;

public class ControlStatementsLecture {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 5;
        System.out.println(x != 5);

        int userAccessLevel = 0;

        if (userAccessLevel == 0 ){
            System.out.println("User is admin");
        }else if (userAccessLevel == 1){
            System.out.println("User does not have admin privileges");
        }else {
            System.out.println("User is a visitor");
        }


        System.out.println("welcome to cool app");
        System.out.println("--------------------");
        System.out.println("What would you like to do");
        System.out.println("1: See some stuff");
        System.out.println("2: Do some stuff");
        System.out.println("3: Exit");


        int userResponse = scanner.nextInt();
        boolean continueRunningApp = true;
        
        switch (userResponse){
            
            case 1:
                System.out.println("You're seeing some stuff");
                break;
            case 2:
                System.out.println("You're doing some stuff");
                break;
            case 3:
                System.out.println("Exiting");
                break;
            default:
                System.out.println("That is not an option");
        }
        while (continueRunningApp);


    }
}
