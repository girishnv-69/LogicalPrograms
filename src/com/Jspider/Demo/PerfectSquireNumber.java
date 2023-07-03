package com.Jspider.Demo;

import java.util.Scanner;

public class PerfectSquireNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		 System.out.println("Enter the number");
		 int n = ip.nextInt();
		 boolean flag=false;
		 for (int i=1; i<=n;i++) {
			 if(i*i==n) {
				 flag=true;
				 break;
			 }			 
		 }
		 if(flag==false) {
			 System.out.println("not a perfect squire num");
		 }
		 else {
			 System.out.println("perfect squire number");
		 }
	}

}
