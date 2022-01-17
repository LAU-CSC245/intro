package example2;
import java.util.Scanner;
public class Main2{
    public static void main(String[] args){
        System.out.println("Example2");
        System.out.println("Enter two integers");
        Scanner input=new Scanner(System.in);
        float a=input.nextFloat();
        float b=input.nextFloat();
        input.close();
        if (a%b==0) {
        	System.out.println("b divides a");
        }
        else if (b%a==0) {
        	System.out.println("a divides b");
        	
        }
        else 
        	System.out.println("a and b are not divisible by one another");
        /* uncomment the line below and run. */
         //System.out.println("They are not necessarily relatively prime");
    }
}