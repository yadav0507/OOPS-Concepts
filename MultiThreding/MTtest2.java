class MTtest2 extends Thread{

    public void run(){
        int i = 1;
        while(true){
            System.out.println(i + "Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        MTtest2 t = new MTtest2();
        t.start();

        int i = 1;
        while(true){
            System.out.println(i + "World");
            i++;
        }
    }

    
    
}
