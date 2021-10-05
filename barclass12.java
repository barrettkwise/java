import java.util.Scanner;

public class barclass12 {
    public static void main( String args[] ) {
        Scanner input = new Scanner(System.in);
        int prime = 0, primeindex = 0, index = 0;
        int a [] = new int [7];
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter distict number " + (i + 1));
            a[i] = input.nextInt();
            if (a[i] < 2) {
                System.out.println("that number is less than 2");
            }
        }

        for (int i : a) {
            boolean value = check_If_Prime(i);
            if (value == true && prime <= i) {
                prime = i;
                primeindex = index;
            }
            index = index + 1; 
        }
        boolean value = check_If_Prime(prime);
        if (value == true) {
            System.out.println("largest prime number is: " + prime);
            System.out.println("it is in cell " + primeindex);
        }
        else {
            System.out.println("no prime numbers");
        } 
    }
    
        public static boolean check_If_Prime(int p) {
        int i = 2;
        boolean m = true;
        if(p == 1 || p == 0) {
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
   

