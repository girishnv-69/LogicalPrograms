package com.Jspider.Demo;

public class DuplicateStr {

	public static void main(String[] args) {
		String str="girish";
	      for(int i=0;i<=str.length()-1;i++)
	      {
	          int c=0;
	          for(int j=0;j<=str.length()-1;j++)
	          {
	              if(str.charAt(i)==str.charAt(j))
	              {
	                  c++;
	                 
	              }
	          }
	          if(c>1)
	      {
	          System.out.print(str.charAt(i));
	      }
	      }
	}

}
