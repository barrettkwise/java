import java.util.Scanner;

public class perfectnumber {
    public static void main (String args[])  {
        Scanner in = new Scanner (System.in);
        int x = 0;
        System.out.println("enter number: ");
        int num = in.nextInt();
        int a [] = new int [num];
        if (num < 1) {
            System.out.println("enter number greater than 0");
        }
        else {
            for (int i = 1; i < num + 1; i++) {
                a[x] = num / i;
                if (a[x] != num) {
                    System.out.println("factors of x: " + a[x]); 
                }  
            }
        }
    }
}