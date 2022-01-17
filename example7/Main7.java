package example7;
import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String x = input.next();
		String[] tokens=tokenize(x);
		input.close();
		for(int i=0;i<tokens.length;++i)
			System.out.println("Token "+i+" is "+tokens[i]);
		System.out.println("Other methods");
		others(x);
	}

	public static String[] tokenize(String s) {
	/* count the number of commans in string */
		int count=0;
		for(int i=0;i<s.length();++i)
			if(s.charAt(i)==',')count++;
		String[] tokens=new String[count+1];
		int start,end;
		start=0;
		end=s.indexOf(',');
		for(int i=0;i<count;++i) {
			tokens[i]=s.substring(start,end);
			start=end+1;
			end=s.indexOf(',',start);
		}
		tokens[count]=s.substring(start);
		return tokens;
		
	}
	public static void others(String s) {
		 String sub="csc245"; 
		 boolean r=s.contains(sub);
		 System.out.println("Contains "+sub+" =>"+r);
		 System.out.println(s.contentEquals("CSC245,CSC310,csc499"));
		 System.out.println(s.equalsIgnoreCase("CSC245,CSC310,csc499")); 
		 
	}

}
