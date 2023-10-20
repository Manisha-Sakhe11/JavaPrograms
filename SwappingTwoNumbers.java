package javaPratice;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		int a=10 , b=20;
		
		System.out.println("Before swapping the values are" +a+ " " +b);
		
//		int t=a;
//		a=b;
//		b=t;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Afer swapping the values are" +a+ " " +b);
		

		
	}

}
