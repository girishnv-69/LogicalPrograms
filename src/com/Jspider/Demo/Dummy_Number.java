package com.Jspider.Demo;
import java.util.Scanner;
public class Dummy_Number {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter the number");
		int n=ip.nextInt();
		int rem=0;
		int count=0;
		while(n!=0) {
			rem=n%10;
			if(rem==9) {
				count++;
			}
			n=n/10;
		}
		if(count>2) {
			System.out.println("dummy number");
		}
		else {
			System.out.println("not a dummy number");
		}
		
	}

}
