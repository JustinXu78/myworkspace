package com.gladiatorxu.ch03;

import java.util.Scanner;

public class Test03 {

	/**
	 * @param args
	 * ����������
	 * �Ա���
	 * �Ը񣺿���
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
//			System.out.println("������");
//			name = scan.next();
//			System.out.println("���䣺");
//			age = scan.nextShort();
//			System.out.println("�Ա�");
//			sex = scan.next().charAt(0);
//			System.out.println("��ߣ�");
//			height = scan.nextFloat();
//			System.out.println("�Ը�");
//			type = scan.next();
//		}finally{
//			scan.close();
//		}
		input();
		System.out.println("��Һã��ҽ�"+name+","+"����"+age+"��,"+"���"+height+"��,"+"����һλ"+type+"��"+sex+"ʿ��");
	}
	static void input(){
		Scanner scan=new Scanner(System.in);
		try{			
			System.out.println("������");
			name = scan.next();
			System.out.println("���䣺");
			age = scan.nextShort();
			System.out.println("�Ա�");
			sex = scan.next().charAt(0);
			System.out.println("��ߣ�");
			height = scan.nextFloat();
			System.out.println("�Ը�");
			type = scan.next();
		}finally{
			scan.close();
		}
	}

}
