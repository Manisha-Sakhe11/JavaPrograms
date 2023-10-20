package javaPratice;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str1,str2=" ";
		str1 = sc.nextLine();
		
		for(int i=0; i<str1.length(); i++)
		{
			char ch=str1.charAt(i);
			str2 =ch + str2;
		}
		System.out.println(str2);
			  
	}

}
