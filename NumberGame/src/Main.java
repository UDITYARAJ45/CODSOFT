import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalwin = 0;
        boolean Playagain = true;
        while(Playagain) {
            int win = 0;
            System.out.println("Hello! what is your name");
            String name = input.nextLine();
            System.out.println("well " + name + " I am thinking of guessing the number between 1 to 100 but you Have only 6 attempts ");
            Random rn = new Random();
            int number = rn.nextInt(1, 100);
            int attempts = 6;
            for (int i = 1; i <= 6; i++) {
                System.out.println("Enter the guess number ");
                int yourguess = input.nextInt();

                if (yourguess == number) {
                    System.out.println("Congratulation Your Guess is correct");
                    System.out.println("Hurray ! You wins this Round");
                    win++;
                    break;

                }
                else if (yourguess < number) {
                    attempts--;
                    System.out.println("Attempts left are" + attempts);
                    System.out.println("Your Guess is too low");
                } else if (yourguess > number) {
                    attempts--;
                    System.out.println("Attempts left are " + attempts);
                    System.out.println("your Guess is too High");
                }

            }
            totalwin += win;
            System.out.println("The number I was thinking  was " + number);
            System.out.println("Would you like to play one more round again(Yes/No: )");
            String choice = input.next();
            input.nextLine();
            if (!choice.equalsIgnoreCase("Yes")) {
                Playagain = false;

            }
        }
        System.out.println("You Winning total games :"+totalwin);
            System.out.println("thanks for Playing");
            input.close();

    }
}