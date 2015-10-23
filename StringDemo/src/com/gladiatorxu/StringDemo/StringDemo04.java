package com.gladiatorxu.StringDemo;

public class StringDemo04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="  GladiatorXu@yahoo.com ";
		System.out.println(str.length());
		char[] data = str.toCharArray();
		for(int i = 0; i < str.length();i++){
			System.out.print(data[i] + " ");
		}
		System.out.println("");
		System.out.println(str.charAt(6));
		
		byte[] bytes = str.getBytes();
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(bytes[i] + "\t");
		}
		
		System.out.println(str.indexOf("a"));
		System.out.println(str.trim());
	}

}
