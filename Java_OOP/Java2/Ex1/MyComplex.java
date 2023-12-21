package Java2.Ex1;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex(){
        
    }
    public MyComplex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }
    public double getReal(){
        return real;
    }
    public void setReal(double real){
        this.real = real;
    }
    public double getImag(){
        return imag;
    }
    public void setImag(double imag){
        this.imag = imag;
    }
    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }
    public String toString(){
        return "(real + imagi)";
    }
    public boolean isReal(){
        if(imag == 0)
            return true;
        return false;
    }
    public boolean isImaginary(){
        if(real == 0)
            return true;
        return false;
    }

}
