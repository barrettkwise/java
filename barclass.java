import java.util.Scanner;

public class barclass {
    public static void main( String args[] ) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first number " );
        int number1 = input.nextInt();
        System.out.print("enter second number");
        int number2 = input.nextInt();
        if (number1 < number2)
            System.out.println(number1 + " is less than "+ number2);
        else if (number1 > number2)
            System.out.println(number1 + " is the greater than "+ number2);
        else if (number1 == number2)
            System.out.println(number1 + " is the same as "+ number2);
    }
}