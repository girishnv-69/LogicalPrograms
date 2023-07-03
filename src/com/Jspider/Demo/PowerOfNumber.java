package com.Jspider.Demo;
import java.util.Scanner;
public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner ip= new Scanner(System.in);
			System.out.println("Enter the base");
			int base=ip.nextInt();
			System.out.println("Enter the exponent");
			int exponent =ip.nextInt();
			int power=1;
			for(int i=1; i<=exponent;i++) {
				power=power*base;
			}
			System.out.println(power);
	}

}
