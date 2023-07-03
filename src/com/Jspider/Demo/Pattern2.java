package com.Jspider.Demo;

public class Pattern2 {
	public static void main(String[] args) {
	 int n=5;
	 
		for(int i=1;i<=n;i++)
		{
			char a='A';
			for(int j=1;j<=n;j++)
			{
				if(i+j<=n+1)
				{
					System.out.print(j +" ");
				}
				else
				{
					System.out.print("  ");
				}
				a++;
			}
			System.out.println();
		}
}
}