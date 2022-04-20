package grades;

import java.util.HashMap;
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
        HashMap<String, Student> students = new HashMap<>();
        students.put("nosaile", student1);
        students.put("topherson", student2);
        students.put("bobby34", student3);
        students.put("jjiimmyy", student4);
        String userContinue = null;
        String userYESNO = null;
        do {
            System.out.println(
                    "Here are the github usernames of your students...\n" +
                            students.keySet() +
                            "\n"+
                            "Which username would you like to see more information on?");
            String userAnswer = scanner.nextLine();
//            String userWrongAnswer = scanner.nextLine();
//            students.forEach((key, value) -> {
//                if (students.containsKey(userAnswer) == students.containsValue()) {
//                    System.out.println("Student Name: " +
//                            value.getName() + " | Grade Avg: " +
//                            value.getGradeAverage() );
//
//                }
//            });
//            if (!Objects.equals(userWrongAnswer, userAnswer)){
//                System.out.println("--- INVALID USER ---");
//            }
            if (students.containsKey(userAnswer)){
                Student chosenOne = students.get(userAnswer);
                System.out.println("Student Name: " + chosenOne.getName() + " | Grade Avg: " + chosenOne.getGradeAverage());
            }else{
                System.out.println("INVALID USERNAME " + userAnswer);
            }



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


