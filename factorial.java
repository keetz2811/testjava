package coding;

import java.util.Scanner;

public class factorial {
	public static void main(String args[]) {
		Scanner a = new Scanner(System.in);
		System.out.println("enter the number:")	;
		int n=a.nextInt();
		int fact=1;
		for(int i=n;i>0;i--) {
		fact=fact*i;
		}
		System.out.println(" the factorial of " + n + " is " + fact);

}
}