public class ArraysExercises {


    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
        String person[] = {"Tim", "Jim", "Zim"};

        person = addPerson(person);
        printArray(person);


    }

    public static void printArray(String[] person){
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
    }

    public static String[] addPerson(String[] person){
        String[] newPersonArr = new String[person.length +1];

        for (int i = 0; i < person.length; i++) {
            newPersonArr[i] = person[i];

        }
            String newPerson = "Dim";

        newPersonArr[newPersonArr.length-1] = newPerson;



        return newPersonArr;
        }

    }






