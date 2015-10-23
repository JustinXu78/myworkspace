package com.gladiatorxu.StringDemo;

public class StringBufferDemo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("Gladiatorxu");
		System.out.println(sb);
		tell(sb);
		System.out.println(sb);
		
	}
	public static void tell(StringBuffer s){
		s.append("great gladiatorxu");
	}
}
