package com.Jspider.Demo;

public class Pattern8 {
		public static void main(String[] args) {
			int n=5;
			 
			for(int i=1;i<=n;i++)
			{
//				char a='A';
				for(int j=1;j<=n;j++)
				{
					if(i==1||j==1||i==j)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
//					a++;
				}
				System.out.println();
			}
		}
}
