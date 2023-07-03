package com.Jspider.Demo;

public class Sum {

	public static void main(String[] args) {
		int [] arr= {5,10,25,40,20,15,16,14,12,18};
		int sum=50;
		int c=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			
			for(int j=i+1;j<=arr.length-1;j++)
			{
				
				for(int k=j+1;k<=arr.length-1;k++)
				{
					if(arr[i]+arr[j]+arr[k]==sum)
					{
						c++;
						System.out.println(arr[i]+"   "+arr[j]+"  "+arr[k]);
					}
				}
			}
			
		}
		System.out.println(c);

	}

}
