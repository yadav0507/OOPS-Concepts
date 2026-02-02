//package Interfaces;

class Phone{
    public void call(){
        System.out.println("Phone call :");

    }
    public void SMS(){
        System.out.println("Phone sms");
    }
}

interface ICamera {
    void click();
    void record();   
}

interface IMusic{
    void play();
    void pause();
    
}

class SmartPhone extends Phone implements ICamera, IMusic{
    public void videoCall(){
        System.out.println("Smart video call");
    }


    public void click(){
        System.out.println("Smart phone Clicking photo");
    }
    public void record(){
        System.out.println("Smart phone recording videos");
    }

    public void play(){
        System.out.println("Smart phone playing music");
    }
    public void pause(){
        System.out.println("Smart phone music paused");
    }

}

public class practice {
    public static void main(String[] args) {
        
        IMusic sp = new SmartPhone();
        sp.pause();
        sp.play();

    }
    
}
