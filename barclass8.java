import java.util.Scanner;

public class barclass8 {
    public static void main( String args[] ) {
        Scanner input = new Scanner(System.in);
        int start, end, j;
        System.out.println("What is your starting number: " );
        start = input.nextInt();
        System.out.println("What is your ending number: " );
        end = input.nextInt();
        for (j = start; j <= end; j++) {
            boolean value = check_If_Prime(j);
            if (value == true) {
                System.out.println("prime number = " + j);
            }
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