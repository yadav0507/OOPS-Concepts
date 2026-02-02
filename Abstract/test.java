//package Abstract;

abstract class Hospital{
    abstract void emergency();
    abstract void appointment();
    abstract void admit();
    abstract void billing();
}

class MyHospital extends Hospital{
    
    public MyHospital(){
        System.out.println("This is my Hospital");

    }
    @Override
    void emergency(){
        System.out.println("Emergency in MyHospital");

    }
    @Override
    void  appointment(){
        System.out.println("Get appointment in MyHospital");

    }
    @Override
    void admit(){
        System.out.println("Patient is admitted in MyHospital");
    }
    @Override
    void billing(){
        System.out.println("get the billing");
    }

}

public class test {
    public static void main(String[] args) {
        Hospital h = new MyHospital();
        h.emergency();
        h.appointment();
        h.admit();
        h.billing();
    }
    
}
 