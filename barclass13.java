import java.util.Scanner;

public class barclass13 {
    public static void main( String args[] ) {
        Scanner input = new Scanner(System.in);
        System.out.println("How big do you want your arrays to be? ");
        int length = input.nextInt();
        //first array
        System.out.println("enter first array values.");
        int a [] = new int [length];
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter distict number " + (i + 1));
            a[i] = input.nextInt();
        }
        //second array
        System.out.println("enter second array values.");
        int b [] = new int [length];
        for (int j = 0; j < b.length; j++) {
            System.out.println("enter distict number " + (j + 1));
            b[j] = input.nextInt();
        }
        //intersection of arrays
        int c = 0;
        int inter[] = new int[length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (a[i] == b[j]) {
                    inter[c] = a[i];
                    c++;
                }
            }
        }
        if (c > 0) {
            System.out.println("inter. of arrays:" + " ");
            for (int k = 0; k < c; k++) {
                System.out.print(inter[k] + " ");
            }
        }
        else {
            System.out.println("empty set");
        }
    }
}

