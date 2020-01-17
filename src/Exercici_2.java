import static java.lang.Math.PI;

public class Exercici_2 {
    public static void main(String[] args) {
        Circle c = new Circle(29);
        Cylinder c1 = new Cylinder(3,4);
        System.out.println(c.getArea());
        System.out.println(c1.getVolume());

    }
}

class Circle {
    private double radius = 1.0;
    private String color = "red";


    public Circle(){
    }

    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double area;
        return area = PI*Math.pow(radius,2);
    }


}

class Cylinder extends Circle {
    private double height = 1.0;

    Cylinder(){
    }
    Cylinder(double radius) {
    }
    Cylinder(double radius, double height){
        super(radius);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        double volume;
        return (volume = (2 * PI * getRadius() * height) + (2 * super.getArea()));
    }




}