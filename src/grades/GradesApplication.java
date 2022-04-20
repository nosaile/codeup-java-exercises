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
        student3.addGrade(55);
        student3.addGrade(50);
        student3.addGrade(32);
        Student student4 = new Student("Jimmy");
        student4.addGrade(100);
        student4.addGrade(50);
        student4.addGrade(75);
        HashMap<String, String> students = new HashMap<>();
        students.put("nosaile12", String.valueOf(student1.getName()));
        students.put("topherson95", String.valueOf(student2.getName()));
        students.put("bobby34", String.valueOf(student3.getName()));
        students.put("jimmy67", String.valueOf(student4.getName()));
        String userContinue;
        do {
            System.out.println("Welcome, \n" +
                    "Here are the github usernames of your students...\n" +
                    "What student would you like to see more information on?\n" +
                    students.keySet());
            String userAnswer = scanner.nextLine();
            students.entrySet().forEach(entry -> {
                if (Objects.equals(userAnswer, entry.getKey()))
                    System.out.println("Name: " + entry.getValue());
            });
            System.out.println("Would you like to search again? [y/n]");
            userContinue = scanner.nextLine();
            if (userContinue.equalsIgnoreCase("y")) {
                userContinue = String.valueOf(true);
            } else if (userContinue.equalsIgnoreCase("n")) {
                System.out.println("Goodbye :)");
                userContinue = String.valueOf(false);
            }


        } while (userContinue == String.valueOf(true));

    }
}


