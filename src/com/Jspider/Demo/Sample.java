package com.Jspider.Demo;

public class Sample {

	public static void main(String[] args) {
		
		String s1="hi hello hellodfghjghj  hi goodmorning";
		String [] s2=s1.split(" ");
		String ans=s2[0];
		int max=s2[0].length();
		for(int i=1;i<=s2.length-1;i++)
		{
			if(s2[i].length()>max)
			{
				ans=s2[i];
				max=s2[i].length();
			}
		}
		System.out.println(ans);
	}
}
