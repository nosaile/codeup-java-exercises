package grades;

import java.util.ArrayList;

public class Student {

    private String names;
    private ArrayList<Integer> grades;

    public Student(String names){
        this.names = names;
        this.grades = new ArrayList<>();

    }
    public String getName(){
        return names;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
     this.grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        double avg = 0;
        for (int i = 0; i < this.grades.size(); i++) {
            avg += this.grades.get(i);
        }
        return avg/this.grades.size();
    }


    public static void main(String[] args) {
//       Student student1 = new Student("Chris");
//       student1.addGrade(85);
//        student1.addGrade(90);
//        student1.addGrade(95);
//        Student student2 = new Student("Topher");
//        student2.addGrade(100);
//        student2.addGrade(50);
//        student2.addGrade(75);
//        Student student3 = new Student("Bobby");
//        student3.addGrade(55);
//        student3.addGrade(50);
//        student3.addGrade(32);
//        Student student4 = new Student("Jimmy");
//        student4.addGrade(100);
//        student4.addGrade(50);
//        student4.addGrade(75);
//        System.out.println(student1.getName());
//        System.out.println(student1.getGradeAverage());
//        System.out.println(student2.getName());
//        System.out.println(student2.getGradeAverage());
//        System.out.println(student3.getName());
//        System.out.println(student3.getGradeAverage());
//        System.out.println(student4.getName());
//        System.out.println(student4.getGradeAverage());

    }

}