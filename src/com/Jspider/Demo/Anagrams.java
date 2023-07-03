package com.Jspider.Demo;
import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String s1="abcdf";
		String s2="cdfba";
		
		if(s1.length()==s2.length())
		{
			char [] arr1=s1.toCharArray();
			char [] arr2=s2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if(Arrays.equals(arr1, arr2))
			{
				System.out.println("Anagram");
			}
			
			else {
				System.out.println("Not an Anagram");
			}
			
		}
		else {
			System.out.println("Not an Anagram");
		}

	}

}
