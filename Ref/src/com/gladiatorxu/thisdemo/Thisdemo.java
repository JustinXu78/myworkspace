package com.gladiatorxu.thisdemo;
class People{
	private int age;
	private String name;
	
	public People(int age, String name) {
		this();
		this.age = age;
		this.name = name;
	}
	public People(){
		super();
		System.out.println("�޲ι��캯��");
	}
	public void tell(){
		System.out.println("������"+this.name+"   "+"���䣺"+this.age);
	}
}
public class Thisdemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People p = new People(37, "Justin");
		p.tell();		
	}

}
