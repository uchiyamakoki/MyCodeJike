package com.jikexueyuan.ch02;

public class Test14 {

	public static void main(String[] args) {
		int i=0x1000001;
		float f=i; //intתfloat��ʧ���ȣ�int�Ǿ�ȷֵ��float�ǽ���ֵ/����һ����β�����Ȳ�ͬ
		System.out.println(Integer.toBinaryString(i)+"��"+i);
		System.out.println(Integer.toBinaryString((int)f)+"��"+f);
		
	}

}
