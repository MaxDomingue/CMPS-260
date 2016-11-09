package polygongeneric;

import java.util.ArrayList;


        

public class Polygon {
    
    // 7 points for private data members
    private ArrayList<Point2d> p = new ArrayList();
    private int numPoints = 0;
    
    public Polygon() { }
    
    // 7 points
    public Polygon(int numPoints) {
        this.numPoints = numPoints;
    }
    
    // 7 points
    public boolean addPoint(Point2d point) {
        if ( p.size() < numPoints) {
            p.add(new Point2d(point.getX(), point.getY()));
            return true;
        }
        
        return false;
    }
    
    // 7 points
    public boolean addPoint(double x, double y) {
        if ( p.size() < numPoints) {
            p.add(new Point2d(x, y));
            return true;
        }
        
        return false;
    }
    
    // 7 points
    public void showPoly() {
        for (Point2d p2 : p)
            System.out.println(p2.getX() + " " + p2.getY());
    }
    
}

