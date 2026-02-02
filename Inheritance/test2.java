//package Inheritance;

class Parent{
    public Parent(){
        System.out.println("Non parem of parent Constructor:");
    }
    Parent(int x){
        System.out.println("Parem of parent" + x);
    }
} 

class Child extends Parent{
    public Child(){
        System.out.println(" Non parem of Child Constructer:");
    }
    Child(int y){
        System.out.println("Param of child");
    }
    Child(int x, int y){
        super(x);
        System.out.println(" 2 param of child" + y);
    }
}


public class test2 {
    public static void main(String[] args) {
        
        Child c = new Child(12,20);
        
        
    }
    
}
