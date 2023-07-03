package com.Jspider.Demo;
import java.lang.Package;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Default_natural_Sorting {
public static void main(String[] args) {
	ArrayList<String> a= new ArrayList<String>();
//	a.add(35);
//	a.add(484);
//	a.add(78);
//	a.add(15);
//	System.out.println(a);
	a.add("girish");
	a.add("babu");
	a.add("Amma");
	//Collections.sort(a, (a1,a2)->a2.compareTo(a1));
	Collections.sort(a,new Sorting());
	System.out.println(a);
}
}

class Sorting implements Comparator<String>
{
		@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
}