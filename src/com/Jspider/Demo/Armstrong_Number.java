package com.Jspider.Demo;
import java.util.Scanner;
public class Armstrong_Number 
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("enter the number");
		int n=ip.nextInt();
		int n1=n,n2=n;
		int c=0;
		while(n!=0) 
		{
			c++;
			n=n/10;
		}
		int rem=0;
		int sum=0;
		while(n1!=0) {
			rem=n1%10;
		 int power=1;
		for(int i=1;i<=c;i++)
		{
		power=power*rem;
		}
			sum=sum+power;
			n1=n1/10;
		}
		
		if(n2==sum) 
		{
			System.out.println("Armstrong");
			
		}
		else {
			System.out.println("Not an Armstrong");
		}	
	}
}
