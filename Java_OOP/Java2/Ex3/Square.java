package Ex3;

public class Square extends Rectangle{
    protected double side;
    
    public Square(){
        super();
    }
    public Square(double side){
        super();
        this.side = side;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side = side;
    }
    public void setLength(double side){
        this.side = side;
    }
    public void setWidth(double side){
        this.side = side;
    }
    @Override
    public String toString(){
        return "Square[Rectangle[Shape[color = " + color + ", filled" + filled + "], length = " + length + ", width = " + width + "], side = " + side + "]";
    }
}
