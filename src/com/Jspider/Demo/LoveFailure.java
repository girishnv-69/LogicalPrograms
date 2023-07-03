package com.Jspider.Demo;
import java.util.Scanner;
public class LoveFailure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip= new Scanner(System.in);
		System.out.println("Enter two inputs");
		int heartRate=ip.nextInt();
		int liverRate=ip.nextInt();
		if(heartRate>=6 && liverRate>=7) {
			System.out.println("Love Failure Person");
		}
		else
		{
			System.out.println("Not Love Failure Person");
		}
		
	}

}
