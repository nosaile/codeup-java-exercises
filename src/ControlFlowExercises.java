import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        int i = 5;
//
//        while (i <= 15) {
//            System.out.print(i++ + " ");
//        }
//        for (int i = 5; i <= 15 ; i++) {
//            System.out.print(i + " ");
//
//        }


//        int i = 2;
//        do {
//            System.out.println(i);
//            i += 2;
//        }while(i <= 100);

//        for (int i = 2; i <= 100; i+=2) {
//            System.out.println(i);
//        }
//
//
//        int numBer = 100;
//
//        do {
//            System.out.println(numBer);
//            numBer -= 5;
//        } while (numBer >= -10);

//        for (int i = 100; i >= -10; i-= 5) {
//            System.out.println(i);
//        }
//
//
//        int square = 2;
//        do {
//            System.out.println(square);
//            square = (int) Math.pow(square, 2);
//        } while (square <= 1000000);

//        for (int i = 2; i <= 1000000L; i*=i) {
//            System.out.println(i);
//        }

//        int i = 0;
//        while (i < 100) {
//            i++;
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("Fizz Buzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            }else if (i % 3 == 0){
//                System.out.println("Fizz");
//            }else System.out.println(i);
//
//        }
//        System.out.println("Enter an integer: ");
//        int userInt = scanner.nextInt();
//
//
//
//        System.out.println("Here is your table.");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------ | ------");
//        for (int i = 1; i <= userInt; i++) {
//            System.out.printf("%-6d | %-6d | %-6d%n", i, i*i, i*i*i);
//
//        }
        boolean anotherGrade = true;
        do {
            System.out.println("Enter your numerical grade: ");
            int userGrade = scanner.nextInt();

            if (userGrade >= 88) {
                System.out.println("A");
            } else if (userGrade >= 80) {
                System.out.println("B");
            } else if (userGrade >= 67) {
                System.out.println("C");
            } else if (userGrade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
            System.out.println("Would you like to continue? (y/n)");
            String userResponse = scanner.next();
            if (!userResponse.equalsIgnoreCase("y")) {
                anotherGrade = false;
                System.out.println("Good-bye!");
            }


        }while (anotherGrade) ;
    }
}



