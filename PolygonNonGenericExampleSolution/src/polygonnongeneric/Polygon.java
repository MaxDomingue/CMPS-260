package polygonnongeneric;

import java.util.ArrayList;

public class Polygon {
    
    // 7 points for private data members    
    private ArrayList p = new ArrayList();
    private int numPoints = 0;
    
    public Polygon() { }
    
    // 7 points
    public Polygon(int numPoints) {
        this.numPoints = numPoints;
    }
    
    // 7 points
    public boolean addPoint(Point2d point) {
        if (numPoints > p.size()) {
            p.add(new Point2d(point.getX(), point.getY()));
            return true;
        }
        
        return false;
    }
    
    // 7 points
    public boolean addPoint(double x, double y) {
        if (numPoints > p.size()) {
            p.add(new Point2d(x, y));
            return true;
        }
        
        return false;
    }
    
    // 7 points
    public void showPoly() {
        for (Object o : p) {
            Point2d p2 = (Point2d)o;
            System.out.println(p2.getX() + " " + p2.getY());
        }
    }
    
}

