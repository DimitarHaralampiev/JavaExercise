package OOP.Encapsulation.Box;

import java.io.*;

public class Box {

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    public double surfaceArea(){
        return ((2 * length * width) + (2 * length * height) + (2 * width * height));
    }

    public double lateralSurfaceArea(){
        return ((2 * length * height) + (2 * width * height));
    }

    public double volume(){
        return (width * height * length);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0){
            throw new NumberFormatException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new NumberFormatException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new NumberFormatException("Height cannot be zero or negative.");
        }
        this.height = height;
    }
}
