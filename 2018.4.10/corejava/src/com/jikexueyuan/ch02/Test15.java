package com.jikexueyuan.ch02;

public class Test15 {

	public static void main(String[] args) {
		//long l=0x20000000000001L;
		//double d=l;//double尾数52位，无法那啥54位long所以丢失精度 如果小类型精度比大类型高，小转大也会精度丢失
		//System.out.println(Long.toBinaryString(l)+"："+l);
		//System.out.println(Long.toBinaryString((long)d)+"："+d);
		char c=65;
		int i='B';
		System.out.println(c+","+i);
	}
}
