import java.util.Scanner;

public class barclass6 {
    public static void main( String args[] ) {
        Scanner input = new Scanner(System.in);
        int counter = 0, number1 = 0, evenproduct = 1, counter2 = 0;
        while (counter2 == 0) {
            System.out.println("enter number " );
            number1 = input.nextInt();
            if ( (number1 % 2 ) == 0) {
                counter = counter + 1;
                evenproduct = evenproduct * number1;
                System.out.println("that number is even");
            }
            
            if (counter == 3) {
                System.out.println("the product " + evenproduct);
            }
        }
    }
}  