package com.Jspider.Demo;
import java.util.Scanner;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter the number");
		int n=ip.nextInt();
		int rem=0;
		int sum=0;
		while(n!=0) 
		{
			rem=n%10;
		int fact=1;
		for(int i=1;i<=rem;i++) 
		{
			fact=fact*i;
			
		}
		sum=sum+fact;
		n=n/10;
		}
		System.out.println(sum);
	}
}
