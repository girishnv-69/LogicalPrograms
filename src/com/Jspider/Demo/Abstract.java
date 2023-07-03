package com.Jspider.Demo;

public class Abstract implements Person {

	
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("person is working");
	}
   public static void main(String[] args) {
	   Abstract a1 = new Abstract();
	   a1.work();
	   System.out.println(Person.a);
}
}
