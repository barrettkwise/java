import java.util.Random;
import java.util.Scanner;

public class crapsgame {
    public static void main (String args[])  {
        Random r = new Random();
        Scanner scan = new Scanner (System.in);
        System.out.println("game of craps");
        System.out.println("how many times would you like to play the game?");
        int timesplay = scan.nextInt();
        boolean game = true;
        int roll = 0, point = 100;
        float winchance = 0, avggame = 0, rollavg1 = 0, rollavg2 = 0, winnum = 0;
        for (int i = 0; i < timesplay; i++) {
            System.out.println("");
            System.out.println("game# " + (i + 1));
            game = true;
            roll = 0;
            winchance = winnum / timesplay;
            rollavg1 = rollavg1 + rollavg2;
            avggame = rollavg1 / timesplay;
            while (game == true) {
                int rand1 = r.nextInt(6);
                int rand2 = r.nextInt(6);
                int sum = rand1 + rand2;
                System.out.println("roll #" + (roll + 1) + " = " + sum);
                if (roll == 0) {
                    if (sum == 7 || sum == 11) {
                        System.out.println("you win");
                        game = false;
                        sum = 0;
                        winnum = winnum + 1;
                    }
                    else if (sum == 2 || sum == 3 || sum == 12) {
                        System.out.println("you lose");
                        game = false;
                    }
                    else if (sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10) {
                        point = sum;
                        sum = 0;
                        System.out.println("your point is " + point);
                    }
                }
                if (sum == point) {
                    System.out.println("you win");
                    game = false;
                    winnum = winnum + 1;
                }
                else if (sum == 7) {
                    System.out.println("you lose");
                    game = false;
                }
                roll++;
                rollavg2 = roll;
            }
        }
        System.out.println("chances of winning are: " + winchance);
        System.out.println("average length of game: " + avggame);
    }
}
