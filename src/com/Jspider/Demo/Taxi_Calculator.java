package com.Jspider.Demo;
import java.util.Scanner;
public class Taxi_Calculator {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter the km");
		int km=ip.nextInt();
		int minvalue=50;
		int midvalue=150;
		int maxvalue=200; 
		if(km<2) {
			System.out.println(minvalue);
		}
		else if(km>2&&km<=7) {
			System.out.println(minvalue + (km-2)*30);
		}
		else if(km>7&&km<=12) {
			System.out.println(minvalue + midvalue + (km-7)*40);
		}
		else  {
			System.out.println(minvalue + midvalue+ maxvalue+km*50);
		}
	}

}
