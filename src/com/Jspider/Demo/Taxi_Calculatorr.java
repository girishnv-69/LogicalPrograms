package com.Jspider.Demo;
import java.util.Scanner;
public class Taxi_Calculatorr {
	public static void main(String[] args) {
	Scanner ip=new Scanner(System.in);
	System.out.println("enter the km");
	int km=ip.nextInt();
	int minv=50;
	int midv=150;
	int maxv=200;
	if(km<2) {
		System.out.println(minv);
	}
	if(km>2&&km<=7) {
		System.out.println(minv+(km-2)*30);
	}
	if(km>7&&km<=12) {
		System.out.println(minv+midv+(km-7*40));
	}
	if(km>12) {
		System.out.println(minv+midv+maxv);
	}
	
	}
}