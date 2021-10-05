import java.util.Scanner;

public class barclass10 {
    public static void main( String args[] ) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int a [] = new int [5];
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter number" + (i + 1));
            a[i] = input.nextInt();
            total = total + a[i];
        }
        int average = total / a.length;
        System.out.println(average);
        for (int i : a ) {
            if (i < average) 
                System.out.println(i +  " is less than " + average);
            else {
                System.out.println(i +  " is greater than " + average);
            }
        }
    }
}
