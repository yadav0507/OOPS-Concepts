//package Inheritance;

class Rectangle{
    int length;
    int breadth;

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    void display(){
        System.out.println("Length: "+ this.length);
        System.out.println("breadth: "+ this.breadth);
    }
}

public class test4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(23, 4);
        Rectangle r2 = new Rectangle(12, 12);
        r.display();
        r2.display();
    }
    
}
