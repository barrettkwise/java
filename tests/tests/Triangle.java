public class Triangle {
    private int x, y;
    public Triangle () {
        this.x = 0;
        this.y = 0;
    }

    public Triangle (int x, int y) {
        this.x = x;
        this.y = y;  
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX (int x) {
        this.x = x;
    }

    public void setY (int y) {
        this.y = y;
    }
    
    public double getArea () {
        return (0.5 * this.x * this.y);
    }
}


