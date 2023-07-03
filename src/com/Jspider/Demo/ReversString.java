package com.Jspider.Demo;

import java.util.Scanner;

public class ReversString {

	public static void main(String[] args) {
		Scanner ip= new Scanner(System.in);
		String str= ip.next();
		for(int i=str.length()-1;i>=0;i--)
			
		{
			System.out.print(str.charAt(i));
			
		}

	}

}
