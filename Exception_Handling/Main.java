//package Exception_Handling;

public class Main {

    public static void main(String[] args) {

        int a, b, c;

        try {

            a = 10;
            b = 0;

            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Divison by zero : " + e);
        }
        System.out.println("End of program:");
        System.out.println("Bye");
    }

}
