public class Circle {
    private int x, y, r;
    public Circle() {
        this.x = 0;
        this.y = 0;
        this.r = 0;
    }

    public Circle (int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;  
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getR() {
        return this.r;
    }

    public void setX (int x) {
        this.x = x;
    }

    public void setY (int y) {
        this.y = y;
    }

    public void setR (int r) {
        this.r = r;
    }

    public double getArea () {
        return 3.14 * this.r * this.r;
    }
}

