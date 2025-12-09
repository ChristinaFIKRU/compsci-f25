// Christina F
// The regurlar polyfon class tester code
// 11/4/25

public class TestPolygon {
    public static void main (String[] args){

        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6,4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Polygon1:");
        System.out.println("Perimeter:" + polygon1.getPerimeter());
        System.out.println ("Area: " + polygon1.getArea());
        System.out.println();

        System.out.println("Polygon2:");
        System.out.println("Perimeter:" + polygon2.getPerimeter());
        System.out.println ("Area: " + polygon2.getArea());
        System.out.println();
        
        System.out.println("Polygon3:");
        System.out.println("Perimeter:" + polygon3.getPerimeter());
        System.out.println ("Area: " + polygon3.getArea());
        System.out.println();
        


    }

}

