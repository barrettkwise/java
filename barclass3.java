import java.util.Scanner;

public class barclass3 {
    public static void main( String args[] ) {
        int sum = 0, number1 = 0;
        Scanner input = new Scanner(System.in);
        while (sum <= 21) {
            System.out.print("enter number " );    
            number1 = input.nextInt();
            sum = number1 + sum;
            }
            System.out.print("Over 21");
            System.out.print(number1);
        }
    }
