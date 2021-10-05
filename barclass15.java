import java.util.Scanner;
import java.util.Random;

public class barclass15 {
    public static void main( String args[] ) {
        Scanner input = new Scanner(System.in);
        System.out.println("You will guess a number between 1 and 100. You have 10 tries");
        Random rand = new Random();
        int rand_int = rand.nextInt(100);
        int tries = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("enter a number : ");
            int guess = input.nextInt();
            tries = tries + 1;
            if (guess > rand_int) {
                System.out.println("too high");
            }
            else if (guess < rand_int) {
                System.out.println("too low");
            }
            else {
                System.out.println("correct");
                break;
            }
        }
        if (tries > 10) {
            System.out.println("you are out of tries. the correct number was: " + rand_int);
        }
        else {
            System.out.println("You guessed correctly, you took " + tries + " tries");
        }
    }
}