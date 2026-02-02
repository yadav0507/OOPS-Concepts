//package Construtor;

class Cylinder{
    private int radius;
    private int height;

    int getRadius(){
        return radius;
    }
    int getHeight(){
        return height;
    }
    void setRadius(int r){
        radius = r;
    }
    void setHeight(int h){
        height = h;
    }
    void setDimensions(int r, int h){
        radius = r;
        height = h;
    }
    public Cylinder(){
        radius = 0;
        height = 0;
    }
    public Cylinder(int r, int h){
        radius = r;
        height = h;
    }

    public int lidArea(){

        return 2 * radius * radius;
    }
    public int volume(){
        return 2 * radius * height;

    }

}

public class test2 {
    public static void main(String[] args) {
        Cylinder c = new Cylinder(4, 2);

        System.out.println("Area: " + c.lidArea());
        System.out.println("Perimeter: " + c.volume());
        
    }
    
}
