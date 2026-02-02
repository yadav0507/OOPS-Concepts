//package OverRidinng;

class Super{
    public void display(){
        System.err.println("Super class Display");
    }
}

class Sub extends Super{
    
    public void display(){
        System.out.println("Sub class Display");
    }
}


public class test1 {
    public static void main(String[] args) {
        Super sp = new Sub();
        sp.display();

       


    }
    
}
