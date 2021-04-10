
package coding;
import java.util.*;
public class primenumber {
	public static void main(String args[]) {
	Scanner a = new Scanner(System.in);
	System.out.println("enter the number:")	;
	int n=a.nextInt();
	int m=n/2,flag=0;
	if(n==0||n==1) {
		System.out.println("it is not a prime number");
	} else {
		for(int i=2;i<=m;i++) {
			if(n%i==0) {
				System.out.println(n+ "not a prime number")	;
				flag=1;
				break;
				}
		}
			if(flag==0){
					System.out.println(n+ "is a prime number")	;
					
		}
			
		}
	}
}

