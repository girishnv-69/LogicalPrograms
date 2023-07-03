package com.Jspider.Demo;

public class Revers_String {
	public static void main(String[] args) {
		String str="hi hello bro welcom";
//		char [] arr=str.toCharArray();
		String [] arr=str.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
