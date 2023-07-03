package com.Jspider.Demo;

import java.util.Scanner;

public class Factors_of_num {
	public static void main(String[] args)
	{
		Scanner ip = new Scanner(System.in);
		int n=ip.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
	}
}
