package com.gladiatorxu.Ref;

class Ref1{
	String temp = "hello";
}
public class Ref {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ref1 rf1 = new Ref1();
		System.out.println(rf1.temp);
		rf1.temp = "Danny";
		System.out.println(rf1.temp);
		tell(rf1);
		System.out.println(rf1.temp);
		
		String a = new String("Justin");
		System.out.println(a);
//		a="Angel";
		tell2(a);
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
	}
	
	public static void tell(Ref1 rf2){
		rf2.temp="Elijah";
	}
	
	public static void tell2(String b){
		b="Angel";
	}

}
