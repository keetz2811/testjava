package coding;

import java.util.Scanner;

public class armstrong {
	public static void main(String args[]) {
		Scanner a = new Scanner(System.in);
		System.out.println("enter the number:")	;
		int n=a.nextInt();
		int sum=0,b,temp=n;
	
		while(n!=0) {
			b=n%10;
			n=n/10;
			sum=sum+(b*b*b);
		}
		if(temp == sum) {
			System.out.println("it is an armstrong number");
		} else {
			System.out.println("it is not an armstrong number");
		}
		}

}
