//package constructors;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }
    public void run(){
        int count = 1;
        while (true) {
            System.out.println(count++);
            try{
            Thread.sleep(10);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        MyThread m = new MyThread("Himanshu");
        m.start();
        m.interrupt();

    }

}
