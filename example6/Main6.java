/**
 * Example switch statement
 */
package example6;
import java.util.Scanner;
public class Main6 {

	public static void main(String[] args) {
		System.out.println("Select the setting value [1-5]");
		Scanner input=new Scanner(System.in);
		boolean done=false;
		while(!done) {
			int set=input.nextInt();
			done=true;
			switch(set) {
			case 1:
				setValue('A');break;
			case 2:
				setValue('B');break;
			case 3:
				setValue('C');break;
			case 4:
				setValue('D');break;
			case 5:
				setValue('E');break;
			default:
				System.out.println("Invalid value. Try again");
				done=false;
			}
			input.close();
		}
	}
	/*
	 * Dummy method. Doesn't do anything.
	 */
	private static void setValue(char c) {
		System.out.println("The value was set to "+c);
		
	}

}
