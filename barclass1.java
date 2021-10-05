import java.util.Scanner;

public class barclass1 {
    public static void main( String args[] ) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first number");
        int number1 = input.nextInt();
        System.out.print("enter second number");
        int number2 = input.nextInt();
        if ( (number1 % number2) == 0)
            System.out.print(number1 + " is a multiple of " + number2);
        else { 
            System.out.print(number1 + " is a not a multiple of " + number2);
        }
    }
}
 