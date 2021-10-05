import java.util.Scanner;

public class test2 {
    public static void main( String args[] ) {
        Scanner input = new Scanner(System.in);
        int sum = 0, count2 = 0;
        while (sum < 10) {
            System.out.println("enter a number");
            int count = input.nextInt();
            count2 = count2 + 1;
            if (count % 2 == 1) {
                System.out.println(count + " is odd");
            }
            else {
                sum = sum + count;
                System.out.println(count + " is even");
            }
        }
        System.out.println("Sum of even numbers in input: " + sum);
        System.out.println(count2 + " input values were entered");
    }
}