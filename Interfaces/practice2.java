//package Interfaces;

interface Member{
    public void callback();

}

class Store{
    Member mem[] = new Member[100];
    int count = 0;

    void register(Member m){
        mem[count++] = m;
    }

    void inviteSale(){
        for(int i = 0; i < count; i++){
            mem[i].callback();
        }
    }

}

class Customer implements Member{
    String name;
    Customer(String n){
        name = n;
    }
    
    public void callback(){
        System.out.println("OK, I will visit " + name);
    }
}



public class practice2 {
    public static void main(String[] args) {
        Store s = new Store();
        Customer c1 = new Customer("Himanshu");
        Customer c2 = new Customer("Deepak");

        s.register(c1);
        s.register(c2);

        s.inviteSale();
    }
    
}
