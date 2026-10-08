public class Test3 implements Runnable {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + "Hellp");
            i++;
        }
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        Thread th = new Thread(t);
        th.start();

        int i = 1;
        while(true){
            System.err.println(i + "World");
            i++;
        }
    }

}
