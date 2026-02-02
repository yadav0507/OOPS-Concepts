//package Dynamic-method-dispatch;

class Super{
    public void meth1(){
        System.out.println("Super meth1");
    }
    public void meth2(){
        System.out.println("Super meth2");
    }
}

class Sub extends Super{
    @Override
    public void meth2(){
        System.out.println("Sub meth2");
    }
    public void meth3(){
        System.out.println("sub meth3");
    }
}
public class test1 {
    public static void main(String[] args){
        Super s = new Super();
        s.meth1();
        s.meth2();
        //s.meth3();
    }
    
}
