package com.Jspider.Demo;

public class Duplicate_char {

	public static void main(String[] args) {
		String str="hi hello good morning how r u";
		char [] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			int c=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && arr[i]!=' ')
				{
					c++;
					arr[j]='0';
				}
			}
			if(c>1 && arr[i]!='0')
			{
				System.out.println(arr[i]+" -"+c);
			}
		}
		


}
}
