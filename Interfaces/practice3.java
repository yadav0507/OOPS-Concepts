//package Interfaces;

interface Test{
    final static int X = 10;
    public abstract void meth1();
    public void meth2();
    default void meth3(){
        System.out.println("Meth2 of Test");
    }
}

interface Test2 extends Test{
    void meth4();

}

class My implements Test2{
    public void meth1(){}
    public void meth2(){}
    public void meth4(){}
}

public class practice3 {
    public static void main(String[] args) {
        
        System.out.println(Test.X);
        My m = new My();
        m.meth3();
        
    }
    
}
