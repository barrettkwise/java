import java.util.Scanner;

public class CircleTestArray {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("how many circles?");
        int size = in.nextInt();
        Circle c[] = new Circle[size];
        for (int i = 0; i < c.length; i++) {
            System.out.println("input next x cord for circle#" + (i + 1));
            int x = in.nextInt();
            System.out.println("input next y cord for circle#" + (i + 1));
            int y = in.nextInt();
            System.out.println("input next radius for circle#" + (i + 1));
            int r = in.nextInt();
            c[i] = new Circle(x, y, r);
            System.out.println("area for circle#" + (i + 1) + " = " + c[i].getArea());
        }
    }
}