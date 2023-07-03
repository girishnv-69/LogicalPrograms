package com.Jspider.Demo;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

class mySorting implements Comparator<String>
{
	public int compare(String s1,String s2)
	{
		return s1.compareTo(s2);
	}
}

public class SortingInt {

	public static void main(String[] args) {
		ArrayList<String> l=new ArrayList<String>();
		l.add("ab");
		l.add("e");
		l.add("h");
		l.add("i");
		l.add("k");
		Collections.sort(l, new mySorting());
		System.out.println(l);

	}

}
