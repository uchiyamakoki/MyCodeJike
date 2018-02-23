package com.jikexueyuan.ch02;

public class Test02 {

	public static void main(String[] args) {
		String name="张飞";
		char sex='男';
		short age=35;
		float height=1.99f;
		String type="豪放的";
		System.out.println("嗨，大家好，俺叫"+name+",今年"+age+"岁，俺是一个"+type+sex+"士");
		
		name="王菲";
		sex='女';
		age=33;
		height=1.69f;
		System.out.println("嗨，大家好，俺叫"+name+",今年"+age+"岁，俺是一个"+type+sex+"士");
		
		String phoneType="小米3";
		String phoneSystem="Android4.3";
		String cpu="2(双核)";
		float price=1999.0f;
		System.out.println("手机品牌："+phoneType);
		System.out.println("手机操作系统："+phoneSystem);
		System.out.println("cpu数量："+cpu);
	    System.out.println("价格（元）："+price);
		
	}

}
