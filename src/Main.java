import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int randomNum = random.nextInt(101);

        System.out.println("Pick a number between 1 and 100");

        int guesses = 4;


        while (true) {

            int userInputNumber = scanner.nextInt();


            if (userInputNumber < 0 || userInputNumber > 100) {
                System.out.println("Your guess is not between 1 and 100, please try again.");
                System.out.println("You have " + guesses + " guesses left!");
                guesses += 1;

            } else if (userInputNumber == randomNum) {
                System.out.println("You Win! You chose the correct number " + randomNum);
                break;

            } else if (userInputNumber < randomNum) {
                System.out.println("Please pick a higher number");
                System.out.println("You have " + guesses + " guesses left!");
            } else {
                System.out.println("Please pick a lower number");
                System.out.println("You have " + guesses + " guesses left!");
            }

            guesses -= 1;

            if (guesses < 0) {
                System.out.println("You lose, the number to guess was " + randomNum);
                break;
            }

        }





    }
}
