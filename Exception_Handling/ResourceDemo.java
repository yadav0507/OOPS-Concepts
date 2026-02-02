import java.io.*;
import java.util.*;


public class ResourceDemo {

    static FileInputStream fi;
    static Scanner sc;

    static void Divide() throws Exception{

        fi = new FileInputStream("C:/javaProgram/Resource.txt");

        try{
            sc = new Scanner(fi);
    
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            System.out.println(a/c);
        }
        finally{
        fi.close();
        sc.close();
        }
    }
    public static void main(String[] args) throws Exception{

        try{
            Divide();
        }
        catch(Exception e){
            System.out.println(e);
        }
        //int x = sc.nextInt();
        System.out.println();
        
        
    }
    
}
