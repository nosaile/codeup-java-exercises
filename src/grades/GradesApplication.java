package grades;

import java.util.HashMap;

public class GradesApplication{



    public static void main(String[] args) {
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
        students.put("nosaile12345", String.valueOf(student1.getName()));
        students.put("topherson95", String.valueOf(student2.getName()));
        students.put("zzB088yzz", String.valueOf(student3.getName()));
        students.put("xxjIMmyxx", String.valueOf(student4.getName()));

        System.out.println(students);

    }

}
