import java.util.Scanner;

public class test8{
    public static void main(String[] args) {
        boolean value = true;
        Scanner inp = new Scanner (System.in);
        Scanner in = new Scanner (System.in);
        System.out.println("enter array size:");
        int size = in.nextInt();
        String a [] = new String [size];
        for (int i = 0; i < size; i++) {
            System.out.println("enter word " + (i + 1) + " : ");
            a[i] = inp.nextLine();
        }
        String b [] = new String [size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (a[i].compareTo(b[j]) > 0) {
                    System.out.println(b[j] + " > " + a[j]);
                    value = false;
                }
            }
        }
        if (value == true) {
            System.out.println("no such words");
        }
    }
}