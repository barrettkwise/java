import java.util.Scanner;

public class barclass14 {
    public static void main( String args[] ) {
        Scanner input = new Scanner(System.in);
        System.out.println("input size ");
        int length = input.nextInt();
        int a [] = new int [length];
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter number " + (i + 1));
            a[i] = input.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j] ) {
                    System.out.println(a[i] + " < " + a[j]);
                }
                else if (a[i] > a[j] ) {
                    System.out.println(a[i] + " > " + a[j]);
                }
                else {
                    System.out.println(a[i] + " == " + a[j]);
                }
            }
        }
    }
}