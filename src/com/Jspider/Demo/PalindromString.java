package com.Jspider.Demo;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String str= ip.next();
		String str2="";
		for(int i=str.length()-1;i>=0;i--)
		{
			str2=str2+str.charAt(i);
		}
		
		if(str.equals(str2))
		{
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Not AN Palindrom");
		}

	}

}
