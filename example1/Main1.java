package example1;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args){
        System.out.println("Example1");
        System.out.println("Enter two integers");
        Scanner input=new Scanner(System.in);
        /* try to input a non-integer, e.g. 3.4 or 7a 
         * Later we will learn how to handle such situations
         */
        int x=input.nextInt();
        int y=input.nextInt();
        input.close();
        int sum=x+y;
        int diff=x-y;
        int prod=x*y;
        float div=(float)x/y;
        /* replace sum below by x+y and run 
         * System.out.println("x+y="+x+y);
         */
        System.out.println("x+y="+sum);
        System.out.println("x-y="+diff);
        System.out.println("x*y="+prod);
        /* replace div below by x/y and run
         * System.out.println("x/y=",x/y);
         */
        System.out.println("x/y="+div);
    }
}