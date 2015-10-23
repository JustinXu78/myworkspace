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
		System.out.println("无参构造函数");
	}
	public void tell(){
		System.out.println("姓名："+this.name+"   "+"年龄："+this.age);
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
