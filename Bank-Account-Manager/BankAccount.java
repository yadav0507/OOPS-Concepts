public class BankAccount {

    double balance;

    void deoposit(double amount){
        balance += amount;
    }
    void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
        }
        else{
            System.out.println("Insufficient Ammount");
        }
    }
    
    void displayBalance(){
        System.out.println("Current Amount: $" + balance);
    }
    public static void main(String[] args){

        BankAccount acc1 = new BankAccount();
        acc1.balance = 1000;

        System.out.println(acc1.balance);
        
        acc1.deoposit(400);
        System.out.println(acc1.balance);

        acc1.withdraw(900);
        System.out.println(acc1.balance);

        acc1.displayBalance();

    }
    
}
