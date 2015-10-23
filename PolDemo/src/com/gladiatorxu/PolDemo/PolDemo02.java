package com.gladiatorxu.PolDemo;

class A1{
	public void tell(){
		System.out.println("A1--tell");
	}
}

class B1 extends A1{
	public void tell(){
		System.out.println("B1--tell");
	}
}

class C1 extends A1{
	public void tell(){
		System.out.println("C1--tell");
	}
}


public class PolDemo02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		say(new A1());
		say(new B1());
		say(new C1());
	}
	
	public static void say(A1 a){
		a.tell();
	}

}
