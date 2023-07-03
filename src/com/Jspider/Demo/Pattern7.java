
package com.Jspider.Demo;

public class Pattern7 {
		public static void main(String[] args) {
			int n=5;
			 
			for(int i=1;i<=n;i++)
			{
//				char a='A';
				for(int j=1;j<=n;j++)
				{
					if(i+j>=n+1)
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
			System.out.println("==================================");
//			int n=5;
			 
			for(int i=1;i<=n;i++)
			{
//				char a='A';
				for(int j=1;j<=n;j++)
				{
					if(i+j>=n+1)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print(" ");
					}
//					a++;
				}
				System.out.println();
			}
			
			System.out.println("======================================");
			 
			for(int i=1;i<=n;i++)
			{
//				char a='A';
				for(int j=1;j<=n;j++)
				{
					if(i+j>=6)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print(" ");
					}
//					a++;
				}
				System.out.println();
			}
			
			
			
			
//			int n=5;
			 
			for(int i=2;i<=n;i++)
			{
//				char a='A';
				for(int j=1;j<=n;j++)
				{
					if(i<=j)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print(" ");
					}
//					a++;
				}
				System.out.println();
			}
		}
}
