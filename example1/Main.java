package example1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("Example1");
        System.out.println("Enter two integers");
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int y=input.nextInt();
        int sum=x+y;
        int diff=x-y;
        int prod=x*y;
        float div=(float)x/y;
        System.out.println("x+y="+sum);
        System.out.println("x+y="+diff);
        System.out.println("x*y="+prod);
        System.out.println("x+y="+div);

    }

}