package com.jikexueyuan.ch03;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("���������");
		int score=scanner.nextInt();
		boolean isPass=score>=60;
		System.out.println(score+"����:"+isPass);
	}

}
