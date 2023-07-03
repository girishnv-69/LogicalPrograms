package com.Jspider.Demo;

public class RepeatedWordsInString {

	public static void main(String[] args) {
		String s1="hi hello hellodfghjghj  hi goodmorning";
//		char [] arr=s1.toCharArray();
		String [] arr2=s1.split(" ");
	String	ans=arr2[0];
	int max=arr2[0].length();
		for(int i=1;i<=arr2.length-1;i++)
		{
			
			if(arr2[i].length()>max)
				
			{
				ans=arr2[i];
				max=arr2[i].length();
			}
		}
		System.out.println(ans);
	}

}
