import java.util.Scanner;

public class barclass4 {
    public static void main( String args[] ) {
        Scanner input = new Scanner(System.in);
        int x = 0, number1 = 0, number2 = 0;
        while (x < 5) {
            System.out.println("enter number " );    
            number1 = input.nextInt();
            if (number2 < number1) 
                number2 = number1;
            x = x + 1;
        }
        System.out.println("the largest number is " + number2);
    }
}
 