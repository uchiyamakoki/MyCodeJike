package com.jikexueyuan.ch03;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("��������ȼ���");
		char grade=scanner.next().charAt(0);
		switch (grade) {
		case '��':
			System.out.println(5);
			break;
		case '��':
			System.out.println(4);
			break;
		case '��':
			System.out.println(3);
			break;
		case '��':
			System.out.println(2);
			break;
		default:
			System.out.println("����ĵȼ�����");
			break;
		}
	}

}
