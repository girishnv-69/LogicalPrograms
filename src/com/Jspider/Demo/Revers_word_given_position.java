package com.Jspider.Demo;

public class Revers_word_given_position {

	public static void main(String[] args) {
		String str="hello hi bye welcom";
		//o/p="hello ih bye moclew"
		String [] arr=str.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==1)
			{
			String	str1=arr[i];
			
			String str2="";
			for(int j=str1.length()-1;j>=0;j--)
			{
				str2=str2+str1.charAt(j);
			}
			System.out.print(str2 +" ");
		
			}
			else {
				System.out.print(arr[i]+" ");
			}
		}
		

	}

}
