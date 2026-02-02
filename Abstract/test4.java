//package Abstract;

abstract class Shape {
    abstract public double perimeter();

    abstract public double area();
}

class Circle extends Shape {
    int radius = 2;

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Ractangle extends Shape {
    double length;
    double breadth;

    public double perimeter() {
        return 2 * (length + breadth);
    }

    public double area() {
        return length * breadth;
    }
}

public class test4 {
    public static void main(String[] args) {

        Ractangle r = new Ractangle();
        Shape s = new Circle();
        r.breadth = 12;
        r.length = 12;
        

        System.out.println(r.area() + r.perimeter());

        System.out.println(s.perimeter());

    }

}
