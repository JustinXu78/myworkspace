package com.gladiatorxu.PolDemo;

class A{
	public void tell1() {
		System.out.println("A-- tell1");
	}
	public void tell2(){
		System.out.println("A-- tell2");
	}
}

class B extends A{
	public void tell1(){
		System.out.println("B-- Tell1");
	}
	public void tell3(){
		System.out.println("B-- Tell2");
	}
}
public class PolDemo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		A a = b;
		a.tell1();
		a.tell2();
	}

}
