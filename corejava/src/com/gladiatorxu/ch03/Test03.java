package com.gladiatorxu.ch03;

import java.util.Scanner;

public class Test03 {

	/**
	 * @param args
	 * 姓名：赵云
	 * 性别：男
	 * 性格：快乐
	 */
	static String name;
	static short age;
	static char sex;
	static float height;
	static String type;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//		try{			
//			System.out.println("姓名：");
//			name = scan.next();
//			System.out.println("年龄：");
//			age = scan.nextShort();
//			System.out.println("性别：");
//			sex = scan.next().charAt(0);
//			System.out.println("身高：");
//			height = scan.nextFloat();
//			System.out.println("性格");
//			type = scan.next();
//		}finally{
//			scan.close();
//		}
		input();
		System.out.println("大家好！我叫"+name+","+"今年"+age+"岁,"+"身高"+height+"米,"+"我是一位"+type+"的"+sex+"士。");
	}
	static void input(){
		Scanner scan=new Scanner(System.in);
		try{			
			System.out.println("姓名：");
			name = scan.next();
			System.out.println("年龄：");
			age = scan.nextShort();
			System.out.println("性别：");
			sex = scan.next().charAt(0);
			System.out.println("身高：");
			height = scan.nextFloat();
			System.out.println("性格");
			type = scan.next();
		}finally{
			scan.close();
		}
	}

}
