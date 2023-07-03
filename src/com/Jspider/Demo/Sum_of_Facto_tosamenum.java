package com.Jspider.Demo;
import java.util.Scanner;
public class Sum_of_Facto_tosamenum {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter the num");
		int n=ip.nextInt();
//		int n2=n;
		int rem=0;
		int sum=0;
		int fact=1;
		while(n!=0) {
			rem=n%10;
			 fact=1;
			for(int i=0;i<=rem;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(fact!=n) {
			System.out.println(" not awesom student");
		}
		else {
			System.out.println(" a awesome student");
		}
}
}
