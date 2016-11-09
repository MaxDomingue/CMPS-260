package polygongeneric;

public class Point2d {
 
    private double x = 0, y = 0;
    
    public Point2d() { }
    
    public Point2d(double x, double y) {
        setX(x);
        setY(y);
    }
    
    public void setX(double initX) {
        if (initX >= 0 && initX <= 1)
            x = initX;
    }
    
    public void setY(double y) {
        if (y >= 0 && y <= 1)
            this.y = y;
    }
    
    public double getX() { return x; }
    
    public double getY() { return y; }
    
    
}
