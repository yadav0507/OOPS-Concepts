//package Interfaces;

interface Test{
    void meth2();
    void meth1();
}

class My implements Test{

    public void meth1(){
        System.out.println("My meth1");
    }
    public void meth2(){
        System.out.println("Mymeth2");
    }
    public void meth3(){
        System.out.println("My meth3");
    }
}

public class InterfacePractice {
    public static void main(String[] args) {
        
        Test t = new My();
        My m = new My();
        t.meth1();
        t.meth2();
        m.meth3();

    }
    
}
