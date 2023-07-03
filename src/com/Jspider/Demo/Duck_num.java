package com.Jspider.Demo;

import java.util.Scanner;

public class Duck_num {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		 System.out.println("Enter the number");
		 int n1 = ip.nextInt();
		 boolean flag=false;
		 int rem=0;
		 while(n1!=0)
		 {
			 rem=n1%10;
			 if(rem==0) {
				 flag=true;
				 break;
			 }
			 n1=n1/10;
		 }
		 
		 if(flag==false) {
			 System.out.println("not a duck num");
		 }
		 else {
			 System.out.println("duck num");
		 }
	}
}
