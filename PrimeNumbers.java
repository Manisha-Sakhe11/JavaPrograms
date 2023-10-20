package javaPratice;

import java.util.Scanner;

public class PrimeNumbers {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

System.out.println("ENter the number");
int n = sc.nextInt();
boolean flag = true;
if (n>0 && n<=3) {
	flag = true;
} else {
	for(int i = 2;i<=n/2;i++) {
		if(n%i==0) {
			flag = false;
		}else {
			flag = true;
		}
	}

}
if (flag) {
	System.out.println("Prime Number");
} else {
	System.out.println("Not a prime Number");

}
}
}
	
