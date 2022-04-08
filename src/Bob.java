import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean continueRunningConvo;
        do {
            System.out.println("Bob approaches you, what will you say to him....");
            String userResponse = scanner.nextLine();
            continueRunningConvo = true;
            if (userResponse.endsWith("?")) {
                System.out.println("Bob says, \"Suuuuuure...\"");
            } else if (userResponse.endsWith("!")) {
                System.out.println("Bob says, \"Whoa man chilllll...\"");
            } else if (userResponse.isBlank()) {
                System.out.println("Bob says, \"Fine, be that way...\"");
            } else{
                System.out.println("Bob says, \"Whatever bro...\"");
            }if (userResponse.contains("goodbye")) {
            continueRunningConvo = false;


        }
        }while (continueRunningConvo);
    }
}