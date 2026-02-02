//package Construtor;

class Square{
    private int length;
    private int breadth;

    public Square(){
        length = 2;
        breadth = 2;
    }
    public Square(int l, int b){
        length = l;
        breadth = b;
    }

    public int area(){
        return length * breadth;
    }
    boolean isSquare(){
        if(length == breadth){
            return true;
        }
        return false;
        
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    void setLength(int l){
        if(l > 0){
            length = l;
        }
        else{
        length = l;
        }
    }
    void setBreadth(int b){
        if(b > 0){
            breadth = b;
        }
        else{
        breadth = b;
        }
    }

}

public class test {
    public static void main(String[] args) {
        Square s = new Square(10, 5);
       

        System.out.println(s.area());
        System.out.println(s.isSquare());
        
        
    }
    
}
