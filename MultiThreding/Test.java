//package MultiThreding;

public class Test {
    static void display(){
        int i = 1;

        while(true){
            System.out.println(i + "Hell0");
            i++;
        }
    }

    public static void main(String[] args) {
        display();
        int i = 1;
        while(true){
            System.out.println(i + "World");
            i++;
        }
    }
    
}
