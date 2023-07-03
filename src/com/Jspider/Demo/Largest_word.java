package com.Jspider.Demo;

public class Largest_word {

	public static void main(String[] args) {
		String str="hi hello welcom bye";
		String[] arr=str.split(" ");
		int max=arr[0].length();
		String ans=arr[0];
		for (String string : arr) {
			if(max <string.length())
			{
				max=string.length();
				ans=string;
			}
		}
		System.out.println(ans);
	}

}
