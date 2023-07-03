package com.Jspider.Demo;

public class Pattern4 {
		public static void main(String[] args) {
			int n=5;
			char a='A';
			for(int i=1;i<=n;i++)
			{
				
				for(int j=1;j<=i;j++)
				{
					if(i%2!=0)
					{
						System.out.print(a+" ");
						
					}
					
					else
					{
						System.out.print(j+" ");
					}
					
				}
				a++;
				System.out.println();
				
		}
}
}
