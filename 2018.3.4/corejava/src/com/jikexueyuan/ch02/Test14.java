package com.jikexueyuan.ch02;

public class Test14 {

	public static void main(String[] args) {
		int i=0x1000001;
		float f=i; //int转float丢失精度，int是精确值，float是近似值/还有一种是尾数精度不同
		System.out.println(Integer.toBinaryString(i)+"："+i);
		System.out.println(Integer.toBinaryString((int)f)+"："+f);
		
	}

}
