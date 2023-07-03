package com.Jspider.Demo;

import java.util.Scanner;

public class MaximumintArray {

	public static void main(String[] args) {
		
		int arr []= {10,50,30,5,80,25,90};
		int min=arr[0];
		int min2=arr[1];
		for(int i=1 ;i<=arr.length-1;i++)
		{
			if(arr[i]<min)
			{
				min2=min;
				min=arr[i];
				
			}
			else if(arr[i]<min2)
			{
				min2=arr[i];
				
			}
			
		}
		System.out.println(min);
		System.out.println(min2);

	}

}
