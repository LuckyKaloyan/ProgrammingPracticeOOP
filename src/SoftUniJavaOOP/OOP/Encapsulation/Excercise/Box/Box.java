package SoftUniJavaOOP.OOP.Encapsulation.Excercise.Box;

public class Box {
    private double length;
    private double width;
    private double height;


    public Box(double length, double width, double height){
        if(length<=0){throw new IllegalArgumentException("Length cannot be zero or negative.");}
        if(width<=0){throw new IllegalArgumentException("Width cannot be zero or negative.");}
        if(height<=0){throw new IllegalArgumentException("Height cannot be zero or negative.");}
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double calculateSurfaceArea(){
        return (2*(length*width+length*height+width*height)+2*(length*width));
    }
    public double calculateLateralSurfaceArea (){
        return 2*(length*width+length*height+width*height);
    }
    public double calculateVolume(){
        return width*length*height;
    }
}
