package com.jikexueyuan.ch02;

import java.util.Scanner;

public class Test18 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		/*
		 * ���� �� �����
		 */ 
		System.out.println("������");
		String name=scanner.next();
		System.out.println("�Ա�");
		char sex=scanner.next().charAt(0);
		System.out.println("���䣺");
		int age=scanner.nextInt();
		System.out.println("��ߣ�");
		double height=scanner.nextDouble();
		System.out.println("�Ը�");
		String type=scanner.next();
		System.out.println("�ˣ���Һã����У�"+name+",���꣺"+age+"�꣬��ߣ�"+height+"�ף�����һ��"+type+sex+"ʿ");
		
	}

}
