//package Abstract;

abstract class KFC {
    public KFC() {
        System.out.println("My KFC");
    }

    void makeItem() {
        System.out.println("Item is being prepared");
    }

    abstract void billing();

    abstract void offer();
    abstract void festiveOffers();
}

class MyKFC extends KFC {
    public void billing() {
        System.out.println("Get the billing");
    }

    public void offer() {
        System.out.println("Avial the offer");
    }

    public void festiveOffers() {
        System.out.println("get set go");
    }
}

public class test3 {
    public static void main(String[] args) {
        MyKFC k = new MyKFC();
        k.makeItem();
        k.billing();
        k.offer();
        k.festiveOffers();
    }

}
