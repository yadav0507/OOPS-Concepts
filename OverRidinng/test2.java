//package OverRidinng;

class TV{
    public void switchON(){
        System.out.println("Tv is on");
    }
    public void changeChannel(){
        System.out.println("TV channel is changed");
    }
}

class SmartTV extends TV{
    public void switchON(){
        System.out.println("Smart tv is on");
    }
    public void changeChannel(){
        System.out.println("Smart tv channel is changes");
    }
    public void browse(){
        System.out.println("Smart tv browser");
    }
}

public class test2 {
    public static void main(String[] args) {
        TV tv = new SmartTV();
        tv.changeChannel();
        tv.switchON();
        
    }
    
}
