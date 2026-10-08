
class MyThread extends Thread{
    public void run(){
        int count = 1;
        while (true) {
            System.out.println(count++);
            
        }
    }
}

public class ThreadTest2 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.setDaemon(true);
        t.start();
        Thread mainThread = Thread.currentThread();
        mainThread.join();
        
    }
    
    
}


