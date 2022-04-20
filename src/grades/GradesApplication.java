package grades;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class GradesApplication {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student("Chris");
        student1.addGrade(85);
        student1.addGrade(90);
        student1.addGrade(95);
        Student student2 = new Student("Topher");
        student2.addGrade(100);
        student2.addGrade(50);
        student2.addGrade(75);
        Student student3 = new Student("Bobby");
        student3.addGrade(50);
        student3.addGrade(50);
        student3.addGrade(50);
        Student student4 = new Student("Jimmy");
        student4.addGrade(100);
        student4.addGrade(0);
        student4.addGrade(85);
        HashMap<String, String> students = new HashMap<>();
        students.put("nosaile", student1.getName() + " | Grade avg: " + student1.getGradeAverage());
        students.put("topherson", student2.getName() + " | Grade avg: " + student2.getGradeAverage());
        students.put("bobby34", student3.getName() + " | Grade avg: " + student3.getGradeAverage());
        students.put("jjiimmyy", student4.getName() + " | Grade avg: " + student4.getGradeAverage());
        String userContinue = null;
        do {
            System.out.println(
                    "Here are the github usernames of your students...\n" +
                            students.keySet() +
                            "\n"+
                            "Which username would you like to see more information on?\n");
            String userAnswer = scanner.next();


            students.forEach((key, value) -> {
                if (Objects.equals(userAnswer, key)) {
                    System.out.println("Name: " + value);

                }
            });
            String userWrongAnswer = scanner.nextLine();
            if (Objects.equals(userAnswer, userWrongAnswer)) {
                System.out.println("--- INVALID USER ---");
            }



            String userYESNO = null;
            do {
                System.out.println("Would you like to search again? [y/n]");
                userContinue = scanner.nextLine();
                if (userContinue.equalsIgnoreCase("y")) {
                    userYESNO = String.valueOf(false);
                    userContinue = String.valueOf(true);
                } else if (userContinue.equalsIgnoreCase("n")) {
                    System.out.println("Goodbye :)");
                    userYESNO = String.valueOf(false);
                    userContinue = String.valueOf(false);
                }else{
                    System.out.println("INVALID RESPONSE");
                    userYESNO = String.valueOf(true);
                }
            }while(userYESNO == String.valueOf(true));

        } while (userContinue.equals(String.valueOf(true)));

    }
}


