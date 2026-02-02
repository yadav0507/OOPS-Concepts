public class Area {

    // Static members

    /*
        static members are belongs to class
        - Loaded once into memory
        - Shared by all objects
        - Accessed using class name
        - Stored in Method Area/ Class Area
    
    */

    static int x = 10;

    static void show() {

        System.out.println(x);
    }

    // Non static members

/*
    - main() is static
    - A non-static method belongs to an object
    - Static methods cannot directly access non-static methods

    - Created per object
    - Each object gets separate copy
    - Accessed using object reference
    - Stored in Heap memory

*/
    int y = 20;

    void display(){
        System.out.println(y);
    }

    public static void main(String[] args) {
        Area a = new Area();
        

        show(); // static method call , directly called also with class name
        a.display(); // non static method call by objcet of class

    }

}
