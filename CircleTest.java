import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("input x cords ");
        int x = in.nextInt();
        System.out.println("input y cords ");
        int y = in.nextInt();
        System.out.println("input radius ");
        int r = in.nextInt();
        Circle c = new Circle (x, y, r);
        System.out.println("x cords = " + c.getX());
        System.out.println("y cords = " + c.getY());
        System.out.println("radius = " + c.getR());
        System.out.println("The center of the Circle = (" + c.getX() + "," + c.getY() + ")" );
        System.out.println("area = " + c.getArea());
        System.out.println("changing the center and rad. of circle");
        System.out.println("input x cords");
        int d = in.nextInt();
        System.out.println("input y cords");
        int u = in.nextInt();
        System.out.println("input radius");
        int e = in.nextInt();
        c.setX(d);
        c.setY(u);
        c.setR(e);
        System.out.println("x cords = " + c.getX());
        System.out.println("y cords = " + c.getY());
        System.out.println("radius = " + c.getR());
        System.out.println("The center of the Circle = (" + c.getX() + "," + c.getY() + ")" );
        System.out.println("area = " + c.getArea());
    }
}
