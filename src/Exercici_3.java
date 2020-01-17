import javafx.scene.shape.Circle;

public class Exercici_3 {
    public static void main(String[] args) {
    Shape s;
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

class CircleEx3 extends Shape {
   private double radius = 1.0;

    CircleEx3(){
    }
    CircleEx3(double radius){
        this.radius = radius;
    }
    CircleEx3(double radius,String color,boolean filled) {
        super(color,filled);
    }


}