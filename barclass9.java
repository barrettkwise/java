import java.util.Scanner;

public class barclass9 {
    public static void main( String args[] ) {
        Scanner input = new Scanner(System.in);
        int start = 1, end = 200, number = 0, j; 
        for (j = start; j <= end; j++) {
            boolean value = check_If_Prime(j);
            if (value == true) {
                number = j - 2;
                value = check_If_Prime(number);
                if (value == true) {
                    System.out.println(number + " and " + j);
                }
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