import java.util.Random;
import java.util.Scanner;

public class randwalk {
    public static void print (int a[][], int len, int wid){
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < wid; j++) {
                System.out.print (a[i] [j] + "   ");
            }
            System.out.println();
        }
    }

    public static void initialize (int a[][], int len, int wid){
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < wid; j++) {
                a[i][j] = 0;
            }
        }
    }

    public static void main (String args []) {
        Random random = new Random();
        System.out.println ("Two Dimensional Random Walk");
        Scanner in = new Scanner (System.in);
        System.out.println("Input length: ");
        int length = in.nextInt();
        System.out.println("Input width: ");
        int width= in.nextInt();
        System.out.println("How many steps?");
        int steps = in.nextInt();
        int a [] [] = new int [length] [width];
        initialize (a, length, width);
        System.out.println("\n");
        System.out.println("The initial state of the board: " + "\n");
        print(a, length, width);
        System.out.println("\n\n\n");
        int row = length / 2;
        int col = width / 2;
        a [row] [col] += 1;
        int count_steps = 1, unsteps = 0, ssteps = 1;
        System.out.println ("The particle is outside the boundary in the following steps:" + "\n");
        while (count_steps < steps){
            int toss = 1 + random.nextInt(4);
            if (toss == 1) {  //Up   
                row -=1;
                if (row == -1) {// wall above
                    System.out.println ("Row# = " + row + "   " + "Column# = " +  col + "  " + " - Beyond the upper wall");
                    unsteps++;
                    row +=1;
                }
                else {
                    a[row][col] += 1; 
                    ssteps++;
                }
            }
            else if (toss == 2)  {  //Down
                row +=1;
                if (row == length) { // wall below
                    System.out.println ("Row# = " + row + "   " + "Column# = " +  col + "  " + " - Beyond the lower wall");
                    unsteps++;
                    row -=1;
                }
                else {
                    a[row][col] += 1;
                    ssteps++;
                }
            }
            else if (toss == 3) {   //Left
                col -=1;
                if (col == -1) {  // Left wall
                    System.out.println ("Row# = " + row + "   " + "Column# = " +  col + "  " + " - Beyond the left wall");
                    unsteps++;
                    col +=1;
                }
                else {
                    a[row][col] += 1;
                    ssteps++;
                }
            }
            else if (toss == 4) {   //Right
                col +=1;
                if (col == width) {  // Right wall
                    System.out.println ("Row# = " + row + "   " + "Column# = " +  col + "  " + " - Beyond the right wall");
                    unsteps++;
                    col -=1;
                }
                else {
                    a[row][col] += 1;
                    ssteps++;
                }
            }
            count_steps++;
        }
        System.out.println("\n\n");
        System.out.println("The final state of the board: " + "\n");
        print(a, length, width);       
        System.out.println ("\n");
        System.out.println ("Total within boundary steps: " + steps);
        System.out.println ("Total out of boundary steps: " + unsteps);
        System.out.println ("\n\n\n");
    }
}