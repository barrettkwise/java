import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        Scanner in = new Scanner (System.in);

        System.out.println("enter array size: ");
        int size = in.nextInt();
        String a [] = new String [size];
        for (int i = 0; i < size; i++) {
            System.out.println("enter word " + (i + 1) + " : ");
            a[i] = inp.nextLine();
        }
        for (int j = 0; j < size; j++) {
            int count = 0;
            for (int x = 0; x < a[j].length(); x++) {
                if (a[j].charAt(x) >= 'f' && a[j].charAt(x) <= 's') {
                    count = count + 1;
                }
            }
            System.out.println(a[j] + ": " + count);
        }
    }
}