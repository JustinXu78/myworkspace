package com.gladiatorxu.classdemo;

class Person{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 120 && age >=0){
			this.age = age;
		}else{
			System.out.println("age should in the range from 0 to 120, your input is "+age);
			System.out.println("age is set to 10 defaultly");
			this.age = 10;
		}		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class Test01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person per = new Person();
		per.setAge(-37);
		per.setName("Justin");
		System.out.println("name:"+per.getName()+"   "+"age:"+per.getAge());
	}

}
