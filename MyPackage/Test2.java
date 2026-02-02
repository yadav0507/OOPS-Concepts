
class Cylinder{
    public double height;
    public double radius;

    public double lidArea(){
        return Math.PI * radius* radius;
    }
    public double totalSurfaceArea(){
        return 2 * lidArea() + circumference() * height;
    }
    public double volume(){
        return lidArea() * height;
    }
    public double circumference(){
        return 2 * Math.PI * radius;
    }
}

public class Test2 {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        c1.radius = 7;
        c1.height = 4;

        System.out.println(c1.height);
        System.out.println(c1.totalSurfaceArea());
        System.out.println(c1.circumference());
        System.out.println(c1.volume());
        System.out.println(c1.lidArea());
    }
    
}
