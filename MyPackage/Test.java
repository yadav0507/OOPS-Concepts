

class Rectangle1{
    public double length;
    public double breadth;

    public double area(){
        return length * breadth;
    }
    public double perimeter(){
        return 2 + (length * breadth);
    }
    public double circumference(){
        return perimeter();
    }
    public boolean isSquare(){
        if(length == breadth){
            return true;
        }
        else{
            return false;
        }
    }

}

public class Test {
    public static void main(String[] args) {
        Rectangle1 r1 = new Rectangle1();
        r1.length = 2;
        r1.breadth = 3;

        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        System.out.println(r1.circumference());
        System.out.println(r1.isSquare());
        
    }
    
}
