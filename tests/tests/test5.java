import java.util.Scanner;

public class test5 {
    public static void main (String args[])  {
        Scanner in = new Scanner (System.in);
        float avg = 0;
        System.out.println("Enter array size: ");
        int size = in.nextInt();
        int a [] = new int [size];
        System.out.println("Array A");
        for (int i = 0; i < size; i++) {
            System.out.println("Enter number#"  + (i + 1) + " for Array A: ");
            a[i] = in.nextInt();
            avg = avg + a[i];
        }
        avg = avg / size;
        int b [] = new int [size];
        System.out.println("Average of Array A: " + avg);
        System.out.println("Array B");
        for (int j = 0; j < size; j++) {
            System.out.println("Enter number#" + (j + 1) + " for Array B: ");
            b[j] = in.nextInt();
            if (b[j] > avg) {
                System.out.println(b[j] + " is larger than " + avg);
            }
            else if (b[j] < avg) {
                System.out.println(b[j] + " is less than " + avg);
            }
            else {
                System.out.println(b[j] + " is equal to " + avg);
            }
        }
    }
}