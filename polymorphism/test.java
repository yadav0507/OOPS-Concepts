//package polymorphism;

class Max{
    public int max(int a, int b){
        return a>b?a:b;
    }

    public int max(int a, int b, int c){
        if(a > b && a > c) return a;
        else if(b > c) return b;
        else{ return c;}
    }
}

public class test {
    public static void main(String[] args) {
        Max t = new Max();
        t.max(2,4, 0);
        System.out.println(t.max(2,4,50));

       
    }

    
}
