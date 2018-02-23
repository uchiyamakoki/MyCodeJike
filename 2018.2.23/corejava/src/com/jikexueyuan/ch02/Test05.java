package com.jikexueyuan.ch02;

public class Test05 {

	public static void main(String[] args) {
		String name="张飞"; //作用域包括下面
		System.out.println();
		{
			String name1="王菲";
			System.out.println(name1);
		}
	}

}
