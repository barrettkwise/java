import java.util.Random;
import java.util.Scanner;

public class barclass17 {
    public static void print(int b[][], int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print (b[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main (String args[])  {
        Random r = new Random();
        Scanner scan = new Scanner (System.in);
        System.out.println ("Randomly Generated Two Dimensional Arrays - User enters #Rows and #Columns");
        System.out.println ("Input #Rows");
        int rows = scan.nextInt();
        System.out.println ("Input #Columns");
        int cols = scan.nextInt();
        int a[][] = new int [rows][cols];
        int min = 1000, minrow = 0, mincol = 0;
        int max = 0, maxrow = 0, maxcol = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = 1 + r.nextInt(100);
                if (a[i][j] < min) {
                    min = a[i][j];
                    minrow = i;
                    mincol = j;
                }
                if (a[i][j] > max) {
                    max = a[i][j];
                    maxrow = i;
                    maxcol = j;

                }
            }
        }

        System.out.println("2D Array with Random Input Values :");
        print(a, rows, cols);
        System.out.println();
        System.out.println ("Min value = " + min + " Row#" + minrow + " Col#" + mincol);
        System.out.println ("Max value = " + max + " Row#" + maxrow + " Col#" + maxcol);
    }
} 