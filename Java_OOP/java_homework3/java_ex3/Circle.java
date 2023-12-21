package Java1.Ex3;

public class Circle {
    double raidus = 1.0;
    public Circle(){

    }
    public Circle(double radius){
        this.raidus = radius;
    }
    public double getRadius(){
        return raidus;
    }
    public void setRadius(double radius){
        this.raidus = radius;
    }
    public double getArea(){
        return raidus*raidus*Math.PI;
    }
    public double getCircumference(){
        return 2*raidus*Math.PI;
    }
    public String toString(){
        return "Circle[ radius = " + raidus + "]";
    }
}
