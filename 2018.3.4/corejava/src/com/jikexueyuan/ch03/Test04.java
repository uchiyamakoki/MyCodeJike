package com.jikexueyuan.ch03;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("����5���Ʒ���");
		int score=scanner.nextInt();
		switch (score) {
		case 5:
			System.out.println("����");
			break;
		case 4:
			System.out.println("����");
			break;
		case 3:
			System.out.println("����");
			break;
		case 2:
		case 1:
		case 0:
			System.out.println("������");
			break;
		default:
			System.out.println("����ķ�����������Ƶķ���");
			break;
		}
	}

}
