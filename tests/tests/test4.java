import java.util.Scanner;

public class test4 {
    public static void main (String args []) {
        Scanner input = new Scanner(System.in);
        int count1 = 0, count2 = 0;
        System.out.println("Enter start number");
        int start = input.nextInt();
        System.out.println("Enter end number");
        int end = input.nextInt();
        for (int i = start; i <= end; i++) {
            boolean value = check_If_Prime(i);
            if (value == true) {
                System.out.println(i + " is prime");
                count1 = count1 + 1;
            }
            else {
                System.out.println(i + " is not prime");
                count2 = count2 + 1;
            }
        }
        System.out.println("Count of prime numbers from " + start + " to " + end + " = " + count1);
        System.out.println("Count of non-prime numbers from " + start + " to " + end + " = " + count2);
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