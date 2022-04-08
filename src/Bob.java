import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean continueRunningConvo;
        System.out.println("You have stumbled across Bob's path, you should say something to him....");
        do {

            String userResponse = scanner.nextLine();
            continueRunningConvo = true;
            if (userResponse.endsWith("?")) {
                System.out.println("Bob says, \"Suuuuuure...\"");
                System.out.println("What is your response?");
            } else if (userResponse.endsWith("!")) {
                System.out.println("Bob says, \"Whoa man chilllll...\"");
                System.out.println("What is your response?");
            } else if (userResponse.isBlank()) {
                System.out.println("Bob says, \"Fine, be that way...\"");
                System.out.println("What is your response?");
            } else if (userResponse.contains("goodbye")) {
                System.out.println("Bob says, \"See if I even care man...\"");
                System.out.println("Bob is now slinking away as he has become annoyed with this dialogue.");
                continueRunningConvo = false;
            } else {
                System.out.println("Bob says, \"Whatever bro...\"");
                System.out.println("What is your response?");
            }
        } while (continueRunningConvo);
    }
}