//package Exception_Handling;

public class Nasted_try {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, };

        try {

            int r = a[0] / a[1];

            System.out.println(r);
            System.out.println(a[10]);
        }

        catch (ArithmeticException e) {
            System.out.println(e);

        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);

        }
    }
}
