package coding;

import java.util.Scanner;

public class pattern {
public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
	System.out.println("enter the number:")	;
	int rows = in.nextInt();
	for (int i=0;i<rows;i++) {
		for(int j=0;j<=i;j++) {
			System.out.println("*")	;
		}
		System.out.println();
	}
}
}
