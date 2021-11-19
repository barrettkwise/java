import java.util.Scanner;

public class test6 {
    public static void main (String args[])  {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter array size: ");
        int size = in.nextInt();
        int a [] = new int [size];
        System.out.println("Array A");
        for (int i = 0; i < size; i++) {
            System.out.println("Enter number#"  + (i + 1) + " for Array A: ");
            a[i] = in.nextInt();
        }
        int b [] = new int [size];
        System.out.println("Array B");
        for (int j = 0; j < size; j++) {
            System.out.println("Enter number#"  + (j + 1) + " for Array B: ");
            b[j] = in.nextInt();
        }
        int c = 0;
        int inter[] = new int[size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                boolean value = check_If_Prime(b[j]);
                if (value == true) {
                    if (b[j] > a[i]) {
                        System.out.println(b[j] + " is greater than " + a[i] + " and is prime"); 
                    }
                    else if (b[j] < a[i]) {
                        System.out.println(b[j] + " is less than " + a[i] + " and is prime"); 
                    }
                }
            }
        }
        System.out.println("empty set");
    }

    public static boolean check_If_Prime(int p) {
        int i = 2;
        boolean m = true;
        if (p == 1 || p == 0) {
            return false;
        }
        else {
            while (i <= Math.sqrt(p) && m==true) {
                if (p % i == 0) {
                    m = false;
                }
                else   {
                    i++;
                }
            }
            if (m == true)
                return true;
            else
                return false;
        }
    }
}