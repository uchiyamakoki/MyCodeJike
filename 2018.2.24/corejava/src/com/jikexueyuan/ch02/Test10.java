package com.jikexueyuan.ch02;

public class Test10 {
	/*
	 * ��ʾ0-127���ַ�
	 */
	public static void main(String[] args) {
		//System.out.println((char)0+"��"+0);
		//System.out.println((char)1+"��"+1);
		//System.out.println((char)2+"��"+2);
		//for(int i=0;i<128;i++)
		//{
			//System.out.println((char)i+"��"+i);
		//}
		System.out.print('\u4e2d'+"��");
		System.out.println(4*Math.pow(16, 3)+14*Math.pow(16, 2)+2*16+13);
		System.out.println((char)20013+"��"+20013);
		System.out.println("�Һ�\n�㲻��һ��Ӵ");
		System.out.println("\t����������ʾӴ��");
		System.out.println("System.out.println(\"˫����Ҳ��ʾ������\");");
	}

}
