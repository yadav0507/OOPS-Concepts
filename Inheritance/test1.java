//package Inheritance;

class Circle{

    public  double radius;
    public Circle(){
        radius = 0;

    }
    public double area(){
        return Math.PI * radius * radius;
        
    }
    public double perimeter(){
        return 2 * Math.PI* radius;

    }

}

class Cylinder extends Circle{
    public double height;

    public Cylinder(){
        height = 0;
    }
    public double volume(){
        return area() * height;

    }
}

public class test1 {
    public static void main(String[] args) {
       // Circle c1 = new Circle();
        Cylinder c2 = new Cylinder();

        c2.radius = 7;
        c2.height = 10;


        System.out.println("Area: " + c2.area());
        System.out.println("perimeter: " + c2.perimeter());
        System.out.println("Volume: " + c2.volume());

    }
    
}
