import java.util.Scanner;

public class barclass7 {
    public static void main( String args[] ) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        System.out.println("how many numbers " );
        count = input.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.println("enter number");
            int number = input.nextInt();
            int x = 0;
            for (int j = 1; j <= number; j++) {
                x = x + j;
            }
            System.out.println("sum of values from 1 through " + number + " = " + x);
        }
    }
}

