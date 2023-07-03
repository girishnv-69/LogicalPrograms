package com.Jspider.Demo;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		System.out.println("enter the number");
		int n=ip.nextInt();
		int sum=0;
		int rem=0;
		while(n!=0) {
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println(sum);	
	}
	
}

