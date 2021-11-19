import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("input baselength: ");
        int x = in.nextInt();
        System.out.println("input height: ");
        int y = in.nextInt();
        Triangle t = new Triangle (x, y);
        t.setX(x);
        t.setY(y);
        System.out.println("base: " + t.getX() + " height: " + t.getY() + " area: " + t.getArea());
        System.out.println("input height: ");
        int i = in.nextInt();
        System.out.println("input base length: ");
        int j = in.nextInt();
        t.setX(i);
        t.setY(j);
        System.out.println("base: " + t.getX() + " height: " + t.getY() + " area: " + t.getArea());
    }
}