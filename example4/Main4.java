package example4;

public class Main4 {

	public static void main(String[] args) {
		int sum=0,prod=1;
		for(int i=1;i<10;i+=1) {
			sum+=i;
			prod*=i;
		}
		System.out.println("Sum="+sum+",Product="+prod);
		int a=10,b=19;
		
		while(a!=0 && b!=0) {
			a-=1;
			b-=2;
		
		}
		System.out.println("a="+a+",b="+b);

		

	}

}
