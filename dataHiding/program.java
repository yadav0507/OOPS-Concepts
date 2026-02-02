//package dataHiding;

class Rectangle{
    private double length;
    private double breadth;

    double getLength(){
        return length;
    }
    double getBreadth(){
        return breadth;
    }

    void setLength(double l){
        if(l > 0){
            length = l;
        }
        else{
            length = 0;
        }
        
    }

    void setBreadth(double b){
        if(b >  0){
            breadth = b;
        }
        else{
            breadth = 0;
        }

    }

    public double area(){
        return length * breadth;
    }
    public double perimeter(){
        return 2 * (length + breadth);
    }

}

public class program {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        r.setLength(-2.4);
        r.setBreadth(2.5);

        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());

        System.out.println(r.getBreadth());
        System.out.println(r.getLength());
        

    }
    
}
