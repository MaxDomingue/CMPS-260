package polygonnongeneric;

public class PolygonNonGeneric {

    public static void main(String[] args) {
        
        // 10 points
        
        Polygon p = new Polygon(5);
        
        p.addPoint(new Point2d(.1, .2));
        p.addPoint(new Point2d(.2, .3));
        p.addPoint(.5, .7);
        p.addPoint(.4, .8);
        p.addPoint(.3, .9);
        p.addPoint(.9, .1);
        
        p.showPoly();
        
        
        
    }

}
