//package Inheritance;

class Rectangle{
    int length;
    int breadth;
    int x = 10;

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
}

class Cuboid extends Rectangle{
    int height;
    int x = 20;

    Cuboid(int l, int b, int h){
        super(l, b);
        height = h;
    }

    void display(){
        System.out.println(super.x);
        System.out.println(x);
    }
}

public class test5 {
    public static void main(String[] args) {
        Cuboid c1 = new Cuboid(2, 3, 4);
        c1.display();
        System.out.println(c1.length);
    }
    
}
