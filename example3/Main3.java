package example3;
import java.util.Scanner;
public class Main3 {

	public static void main(String[] args) {
		System.out.println("Enter the radius of disk");
		Scanner input=new Scanner(System.in);
		float r=input.nextFloat();
		//input.close();
		double area=2*Math.PI*Math.pow(r, 2);
		System.out.println("Area of disk is "+area);
		others(r);

		System.out.println("Enter three integers");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		input.close();
		System.out.println("The maximum is " +
				max3(a,b,c));
	}
	public static int max3(int x,int y,int z) {
		int result=Math.max(Math.max(x,y),z);
		return result;
	}
	// can be called from Main class only
	private static void others(double x) {
		double cube=Math.pow(x, 3);
		double sqrt=Math.sqrt(x);
		double log10=Math.log10(x);
		System.out.println(x+" cubed is "+cube);
		System.out.println("square root="+sqrt);
		System.out.println("log base 10 of "+x+" is "+log10);

	}

}
