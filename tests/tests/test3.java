import java.util.Scanner;

public class test3 {
    public static void main (String args []) {
        Scanner input = new Scanner(System.in);
        int sum = 0, i;
        while (sum < 10) {
            System.out.println("Enter a number");
            i = input.nextInt();
            check_If_Prime(i);
            boolean value = check_If_Prime(i);
            if (value == true) {
                System.out.println(i + " is prime");
                sum = sum + i;
                System.out.println("sum of prime numbers = " + sum);
            }
            else {
                System.out.println(i + " not is prime");
                System.out.println("sum of prime numbers = " + sum);
            }
        }
        System.out.println("sum of prime numbers exceeds 10, closing now");
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
 