package javaPratice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
	      Scanner sc = new Scanner(System.in); 
	      
	      int r,sum=0,temp;
	      System.out.println("enter the number");
	      int n=sc.nextInt();

	      temp=n;
	      while(n>0) {

	      	r=n%10;

	      	sum=(sum*10)+r;
	      	n=n/10;

	      }

	      if(temp==sum) {

	      	System.out.println("Entered number is palindrome");

	      }else {

	      	System.out.println("Entered number is not palindrome");

	      }

	      }
	}
	      
	      
	      

	      


