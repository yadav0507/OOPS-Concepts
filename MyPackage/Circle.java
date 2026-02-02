//package MyPackage;

class Cricle1{
    public double radius;

    public double area(){
        return Math.PI * Math.sqrt(radius);
    }
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
    public double circumference(){
        return perimeter();
    }
}

public class Circle {
    public static void main(String[] args){
        Cricle1 c1 = new Cricle1();
        c1.radius = 12;
        c1.radius = 13;

        System.out.println(c1.radius);
        System.out.println(c1.perimeter());
        System.out.println(c1.circumference());

    }
    
    
}
