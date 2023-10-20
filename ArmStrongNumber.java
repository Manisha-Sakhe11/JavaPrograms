package javaPratice;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		int temp, r, sum=0,n;
		n=153;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum  +=(r*r*r);
			n=n/10;
		}
		if(sum ==temp)
		{
			System.out.println("Is Armstrong");

		}
		else {
			System.out.println("Is Not Armstrong");

		}	
	}

}

