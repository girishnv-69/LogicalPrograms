
package com.Jspider.Demo;

public class Pattern5 {
		public static void main(String[] args) {
			int n=5;
			 
			for(int i=1;i<=n;i++)
			{
//				char a='A';
				for(int j=1;j<=i;j++)
				{
					if(i%2!=0)
					{
						System.out.print((char)(j+64)+" ");
					}
					else
					{
						System.out.print(j+" ");
					}
//					a++;
				}
				System.out.println();
			}
		}
}
