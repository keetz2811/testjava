package coding;

import java.util.Scanner;

public class palindrome {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number:")	;
		int n=in.nextInt();
		int sum=0,temp=n;
		while(n!=0) {
			int a=n%10;
			n=n/10;
			sum=(sum*10)+a;
			
		}
		if(temp==sum) {
			System.out.println("it is a palindrome number")	;
		} 
		else {
			System.out.println("it is not a palindrome number")	;
		}
}
}