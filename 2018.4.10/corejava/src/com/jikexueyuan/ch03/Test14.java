package com.jikexueyuan.ch03;

import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("�����һ���� ��");
		int a=scanner.nextInt();
		System.out.println("����ڶ����� ��");
		int b=scanner.nextInt();
		if(a>b){
			System.out.println(a+"�������");
		}else {
			System.out.println(b+"�������");
		}
	} 

}
