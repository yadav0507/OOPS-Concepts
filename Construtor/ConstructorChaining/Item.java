class Item{
    String name;
    double price;
    int quantity;

    public Item(){
        this.name = "Jeans";
        this.price = 10.0;
        this.quantity = 1;
        System.out.println("Basic Item Constructor is called ");
    }

    public Item(String name, double price){
        this();
        this.name = name;
        this.price = price;
        System.out.println("Name and price constructor called ");
    }

    public Item(String name, double price, int quantity){
        this(name, price);
        this.quantity = quantity;
        System.out.println("Full Item constructor called " );
    }

    public void display(){
        System.out.println("Item Name: " + name);
        System.out.println("Item Price: " + price);
        System.out.println("Item quantity: " + quantity);
        System.out.println();
    }

    public static void main(String[] args) {
        Item i1 = new Item();
        i1.display();

        Item i2 = new Item("Book", 25.0);
        i2.display();

        Item i3 = new Item("Shirt", 20.9, 2);
        i3.display();
    }
}