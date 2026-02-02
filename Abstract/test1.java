//package Abstract;

abstract class Super{
    public Super(){
        System.out.println("Super Constrtuot");
    }
    public void meth1(){
        System.out.println("Meth of Super");
    }
    abstract public void meth2();
}

class Sub extends Super{
    public void meth2()
    {
        System.out.println("Sub meth2");
    }
}

public class test1 {
    public static void main(String[] args){
        Super s = new Sub();
        s.meth1();
        s.meth2();
        
    }

    
}
