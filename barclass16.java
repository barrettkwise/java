import java.util.Scanner;

public class barclass16 {
    public static void main (String args []) {
        System.out.println("Input two arrays. Both arrays will have the same size");
        Scanner in = new Scanner(System.in);
        int count = 0, cell = 0;
        String[] a = new String[4];
        String[] b = new String[4];
        while (cell < 4) {
            System.out.println("Input Values for Array A");
            String temp = in.nextLine();
            int c = 0;
            for (int i = 0; i < cell; i++) {
                if (temp.equals(a[i])) {
                    c++;
                }
            }
            if (c == 0) {
                a[cell] = temp;
                cell++;
            }
        }
        cell = 0;
        while (cell < 4) {
            System.out.println("Input Values for Array B");
            String temp = in.nextLine();
            int c = 0;
            for (int i = 0; i < cell; i++) {
                if (temp.equals(b[i])) {
                    c++;
                }
            }
            if (c == 0) {
                b[cell] = temp;
                cell++;
            }
        }

        for (int i = 0; i < 4; i++)  {
            for(int j = 0; j < 4; j++) {
                if (a[i].equalsIgnoreCase(b[i])) {
                    count++;
                }
            }
        }
        
        if (count == 4) {
            System.out.print("Arrays A and B are equal");
        }
        else {
            System.out.print("Arrays A and B are unequal");
        } 
    }
}