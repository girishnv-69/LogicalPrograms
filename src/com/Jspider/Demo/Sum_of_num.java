package com.Jspider.Demo;

import java.util.Scanner;

public class Sum_of_num {

	public static void main(String[] args) 
	{
		Scanner ip = new Scanner(System.in);
		int n= ip.nextInt();
		int rem=0 , sum=0;
		while(n!=0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println(sum);
		
		
		
		
	}

}
