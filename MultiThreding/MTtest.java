//package MultiThreding;

class Test extends Thread {

    public void run(){
        int i = 1;
        while(true){
            System.out.println(i + "Hwllp");
            i++;
        }
    }
}

public class MTtest{
    public static void main(String[] args) {
        Test m = new Test();
        m.start();

        int i = 1;
        while(true){
            System.out.println(i + "World");
            i++;
        }
    }

    public void start() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }
}
