package coding;

import java.util.*;

public class palindrometext {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the string/number:")	;
		String n=in.nextLine();
		String reverse="";
		int length = n.length();
		for(int i=length-1;i>=0;i--) {
		 reverse = reverse + n.charAt(i);
		}
		if(n.equals(reverse)) {
			System.out.println("is palindrome")	;
		} else {
			System.out.println("not a palindrome")	;
		}
		
		
	}		
				
}
