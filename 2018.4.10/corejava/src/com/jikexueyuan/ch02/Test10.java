package com.jikexueyuan.ch02;

public class Test10 {
	/*
	 * 显示0-127的字符
	 */
	public static void main(String[] args) {
		//System.out.println((char)0+"："+0);
		//System.out.println((char)1+"："+1);
		//System.out.println((char)2+"："+2);
		//for(int i=0;i<128;i++)
		//{
			//System.out.println((char)i+"："+i);
		//}
		System.out.print('\u4e2d'+"：");
		System.out.println(4*Math.pow(16, 3)+14*Math.pow(16, 2)+2*16+13);
		System.out.println((char)20013+"："+20013);
		System.out.println("我和\n你不在一行哟");
		System.out.println("\t我在这里显示哟！");
		System.out.println("System.out.println(\"双引号也显示出来啦\");");
	}

}
