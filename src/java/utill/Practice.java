package java.utill;
//import java.util.Scanner;
public class Practice {
	public static void main(String [] args) {
	int n=15451;
	int rem=0;
	int sum=0;
	while(n!=0) {
		rem=n%10;
		sum=sum+rem;
		System.out.println(sum);
	}
	n=n/10;
}
}
