// Christina F
// The regurlar polyfon class 
// 11/4/25

public class RegularPolygon{

    private int n; 
    private double side; 
    private double x; 
    private double y; 

    public RegularPolygon(){ //default values
        this (3, 1, 0, 0); 
    }

    public RegularPolygon (int n, double side){ //constructor of n and side centered at 0,0
        this (n, side, 0,0);
    }

    public RegularPolygon (int n, double side, double x, double y){
        this.n =n;
        this.side = side; 
        this.x = x;
        this.y = y;
    }

    public int getN(){
        return n; 
    }
    public void setN(int n){
        this.n = n; 
    }

    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side = side; 
    }
     public double getX(){
        return x;
    }
    public void setX(double x){
        this.x = x; 
    } 
    public double getY(){
        return y;
    }
    public void setY(double y){
        this.y = y; 
    }

    public double getPerimeter(){
        return n*side; 
    }

    public double getArea(){
        return (n*side*side)/(4*Math.tan(Math.PI/n));
    }
    

}