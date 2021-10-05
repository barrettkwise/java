import java.util.Scanner;

public class barclass11 {
    public static void main( String args[] ) {
        Scanner input = new Scanner(System.in);
        System.out.println("How big do you want your array? ");
        int found = 0;
        int size = input.nextInt();
        int a [] = new int [size];
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter number" + (i + 1));
            a[i] = input.nextInt(); 
        }
        System.out.println("input value to search for in the array");
        int f = input.nextInt();
        for (int i : a ) {
            if (f == i) {
                    found = found + 1;
                }
            }
        System.out.println(f + " occurs " + found + " times" );
        }
    }