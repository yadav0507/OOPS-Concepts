//package Inheritance;

class Ractangle{
    int length;
    int breadth;

    Ractangle(){
        length = 1;
        breadth = 1;
    }
    Ractangle(int l, int b){
        length = l;
        breadth = b;
    }
}

class Cuboid extends Ractangle{
    int height;

    Cuboid(){
        height = 1;

    }
    Cuboid(int h){
        height = h;
    }
    Cuboid(int l, int b, int h){
        super(l, b);
        height = h;
    }
    int volume()
    {
        return length*breadth*height;
    }
}

public class test3 {
    public static void main(String[] args) {
        Cuboid c = new Cuboid(10,2,5);
        System.out.println(c.volume());
    }
    
}
