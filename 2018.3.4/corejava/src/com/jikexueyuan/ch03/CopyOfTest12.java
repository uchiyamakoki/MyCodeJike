package com.jikexueyuan.ch03;

import java.util.Scanner;

public class CopyOfTest12 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("����5���Ʒ�����");
		int score=scanner.nextInt();
		boolean isFiveScore=!(score<0||score>5);
		System.out.println(score+"��5���Ʒ�����"+isFiveScore);
	}

}
