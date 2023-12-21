package Ex3;

public class Shape {
    protected String color;
    protected boolean filled;
    protected double radius;

    public Shape(){
        color = "red";
        filled = "true" != null;
    }
    public Shape(String color, boolean filled, double radius){
        this.color = color;
        this.filled = filled;
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return true;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public double getRadius(){
        return radius;
    }
    public  double getArea(){
        return radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    @Override
    public String toString(){
        return "Shape[color = " + color + ", filled = " + filled + "]";
    }
}
