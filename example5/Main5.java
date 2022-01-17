/**
 * Arrays example
 */
package example5;
import java.util.*;
public class Main5 {

	public static void main(String[] args) {
		final int n=100;
		/* try to change the value of n
		 * by uncommenting the line below
		 * n=99; 
		 */
		
		int[] a;
		a=new int[n];
		Random generator=new Random();
		/* fill a with random numbers
		 * from 0(inclusive) to 100 (exclusive)
		 */
		for(int i=0;i<n;++i)
			a[i]=generator.nextInt(1,100);
		
		// find the largest value
		int max=a[0];
		for(int i=1;i<a.length;++i)
			if(a[i]>max)max=a[i];
		
		System.out.println("The largest generated value is "+max);
	
		int[] c= {1,2,3};
		int[] d= {1,2,3};
		System.out.println(c==d);
		System.out.println(Arrays.equals(c,d));
	}

}
