class NegativeDimensionException extends Exception
{
    public String toString(){
        return "Dimension of a Rectangle cannot be negative";
    }
}

public class Reactangle {

    static int area(int l, int b) throws NegativeArraySizeException {
        if (l < 0 || b < 0) {
            throw new NegativeArraySizeException();
        }
        return l * b;

    }

    static void meth1() throws NegativeArraySizeException {
        System.out.println("Area is " + area(10, -5));
    }

    public static void main(String[] args) throws NegativeArraySizeException {
        try {
            meth1();
        } catch (NegativeArraySizeException e) {
            System.out.println(e);
        }

    }

}
