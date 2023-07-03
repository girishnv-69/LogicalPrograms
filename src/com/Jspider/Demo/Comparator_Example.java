package com.Jspider.Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
	int stud_id;
	String stud_name;
	public Student(int stud_id, String stud_name) {
		super();
		this.stud_id = stud_id;
		this.stud_name = stud_name;
	}
	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", stud_name=" + stud_name + "]";
	}
	public class Sorting  implements Comparator<Student>{

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o2.stud_id - o1.stud_id;
		}
		
	}
}

public class Comparator_Example {
	public static void main(String[] args) {
		Student s1= new Student(3, "giri");
		Student s2= new Student(10, "babu");
		Student s3= new Student(1, "amma");
		Student s4= new Student(6, "appa");
		Sorting s= new Sorting();
		ArrayList<Student> a=new ArrayList<Student>();
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		for(Object obj :a)
		{
			System.out.println(obj);
		}
	}

}
