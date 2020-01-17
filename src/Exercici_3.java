import javafx.scene.shape.Circle;

import static java.lang.Math.PI;


public class Exercici_3 {
    public static void main(String[] args) {
    Shape s = new Square(2,"blue",true);
        System.out.println(s.toString());
    }
}

class Shape {
    private String color = "red";
    private boolean filled = true;

    public Shape () {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
/**/
class CircleEx3 extends Shape {
   private double radius = 1.0;
    // Overload al constructor depenent del parametres.
   public CircleEx3(){
    }
   public CircleEx3(double radius){
        this.radius = radius;
    }
    public CircleEx3(double radius,String color,boolean filled) {
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area;
        return area = PI*Math.pow(radius,2);
    }

    public double getPerimeter(){
       double perimeter;
       return perimeter = (2*PI)*radius;
    }

    @Override
    public String toString() {
        return "CircleEx3{" +
                "radius=" + radius +
                '}';
    }
}

class Rectangle extends Shape {
    private double width = 1.0;
    private double lenght = 1.0;

    Rectangle() {}
    Rectangle(double width,double lenght){}
    Rectangle(double width,double lenght,String color, boolean filled) {
        super(color,filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double setArea() {
        return 1.0;
    }
    public double setPerimeter(){
        return 1.0;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", lenght=" + lenght +
                '}';
    }
}

class Square extends Rectangle{
    double side = 1.0;

    Square(){ }
    Square(double side) {
    }
    Square(double side,String color,boolean filled) {
        this.side = side;
        super.getColor();
        super.isFilled();

    }
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
