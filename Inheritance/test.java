package Inheritance;

import java.io.DataInput;
import java.sql.Date;

class Account{
    public int accountNO;
    public String name;
    public String address;
    public int mobileNo;
    

    public Account(int accountNo, String name, String address, int mobileNo){
        this.accountNO = accountNo;
        this.name = name;
        this.address = address;
        this.mobileNo = mobileNo;
    }
}

class SavingAccount extends Account{
    public void deposite(int amount){
        

    }
    public int withdraw(){
        return 
    }
    public void 

}

public class test {
    SavingAccount sa = new SavingAccount()
    
}
