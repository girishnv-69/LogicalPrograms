package com.Jspider.Demo;

public class Sorting1 {

	public static void main(String[] args) {
		int [] arr= {10,46,20,90,30,45,18};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int temp=0;
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
		}

	}

}
