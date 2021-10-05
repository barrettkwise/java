import java.util.Scanner;

public class barclass5 {
    public static void main( String args[] ) {
        Scanner input = new Scanner(System.in);
        int counter = 0, oddsum = 0, evensum = 0, number1;
        while (counter < 5) {
            System.out.println("enter number " );
            number1 = input.nextInt();
            if ( (number1 % 2 ) == 0) {
                System.out.println (number1 + " is even ");
                evensum = evensum + number1;
                System.out.println("the sum of the even numbers is " +evensum );
            }    
            else {
                System.out.println (number1 + " is odd ");
                oddsum = oddsum + number1;
                System.out.println("the sum of the odd numbers is " +oddsum );
            }       
            counter = counter + 1;
            }
        }
    }

 