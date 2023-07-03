package com.Jspider.Demo;


import java.util.Arrays;

public class PatternSample {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=5;i++)
		{
			char c='A';
			for(int j=1;j<=5;j++)
			{if(j>=i)
				
			{
				System.out.print("* ");
//				c++;
			}
			else {
				System.out.print(" ");
			}
			}
			System.out.println();
		}
	}
}
