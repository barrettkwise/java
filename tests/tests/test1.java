import java.util.Scanner;

public class test1 {
    public static void main( String args[] ) {
        Scanner input = new Scanner(System.in);
        System.out.println("input a number: ");
        int n = input.nextInt();
        int j = 0, f = 0;
        for (int h = 0; h <= n; h++) { 
            j = j + h;
        }
        System.out.println("sum = " + j);
        if (j / 2 == 1) {
            System.out.println("sum is odd");
        }
        else {
            System.out.println("sum is even");
        }
    }
}