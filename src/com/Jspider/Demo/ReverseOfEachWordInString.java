package com.Jspider.Demo;

public class ReverseOfEachWordInString {
	public static void main(String[] args) {
		String str1="mornin hii hii good morning ";
		String newstr="";
		String [] arr=str1.split(" ");
		
		
		StringBuffer buffer= new StringBuffer(str1);
		//System.out.println(buffer.reverse());
		String rev=" ";
		for(int i=0;i<arr.length;i++) {
			
			String word=arr[i];
			StringBuffer sb= new StringBuffer(word);
			 rev=rev+" "+sb.reverse();
		}
		System.out.print("reverdes    "+ rev);

		
		
	
//		for(int i=0;i<=arr.length-1;i++)
//		{
//			if(i%2!=0) {
//			String word=arr[i];
//			String reverword="";
//			for(int j=word.length()-1;j>=0;j--)
//			{
//				reverword=reverword+word.charAt(j);
//			}
//			newstr=newstr+reverword+" ";
//		}
//		}
//		
//		System.out.println(newstr);
		
	}
}
