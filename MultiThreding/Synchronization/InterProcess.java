//package Synchronization;

class MyData {
    int value;
    boolean flag = true;

    synchronized public void set(int v) {// write

        while (flag != true) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        value = v;
        flag = false;
        notify();
    }

    synchronized public int get() {// read
        int x = 0;
        while (flag != false) {
            try {
                Thread.sleep(1000);wait();
            } catch (Exception e) {
            }
        }
        x = value;
        flag = true;
        notify();

        return x;
    }
}

class Producer extends Thread {
    MyData d;

    Producer(MyData d) {
        this.d = d;
    }

    public void run() {
        int count = 1;
        while (true) {
            d.set(count);
            System.out.println("Producer " + count);
            count++;
        }
    }
}

class Consumer extends Thread {
    MyData d;

    Consumer(MyData d) {
        this.d = d;

    }

    public void run() {
        int value;
        while (true) {
            value = d.get();
            System.out.println("Consumer " + value);

        }
    }
}

public class InterProcess {
    public static void main(String[] args) {
        MyData d = new MyData();
        Producer p = new Producer(d);
        Consumer c = new Consumer(d);

        p.start();
        c.start();
    }

}
