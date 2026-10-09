//package Synchronization;

class ATM {
    synchronized public void checkBalance(String name) {
        System.out.println(name + "Checking ");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println("Balance");
    }

    synchronized public void withdraw(String name, int amount) {
        System.out.println(name + "withdrawing");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(amount);
    }
}

class Customer extends Thread {
    String name;
    int amount;
    ATM atm;

    public Customer(String n, ATM a, int amt) {
        name = n;
        atm = a;
        amount = amt;
    }

    public void useATM() {
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }

    public void run() {
        useATM();
    }
}

public class ATMachine {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Customer c1 = new Customer("Him", atm, 200);
        Customer c2 = new Customer("Harsh", atm, 100);
        c1.start();
        c2.start();
    }

}
