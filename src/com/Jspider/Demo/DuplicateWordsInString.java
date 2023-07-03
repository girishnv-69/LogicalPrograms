package com.Jspider.Demo;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		String str="Big black bug bit big";
		String str1=str.toLowerCase();
		String [] arr=str1.split(" ");
		for(int i=0;i<=arr.length-1;i++)
		{
			int c=1;
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					c++;
					arr[j]="0";
				}
			}
			if(c==1 && arr[i]!="0")
			{
				System.out.println(arr[i]+" "+
			c);
			}
		}
	}
}
