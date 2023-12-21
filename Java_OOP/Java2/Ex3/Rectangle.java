package Ex3;

public class Rectangle extends Shape{
    protected double length = 1.0;
    protected double width = 1.0;

    public Rectangle(){
        super();
    }
    public Rectangle(double length, double width, String color, boolean filled){
        super();
        this.length = length;
        this.width = width;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return (length + width)/2;
    }
    @Override
    public String toString(){
        return "Circle[Shape[color = " + color + ", filled = " + filled + "], length = " + length + ", width = " + width + "]"; 
    }
}
