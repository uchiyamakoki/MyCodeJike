package com.jikexueyuan.ch03;

import java.util.Scanner;

public class Test16 {

public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("����java������");
	int java=scanner.nextInt();
	System.out.println("����Android������");
	int  android=scanner.nextInt();
	System.out.println("����sql������");
	int sql=scanner.nextInt();
	if(java>=android&&java>=sql){
		System.out.println("��߷֣�"+java);
	}else if (android>=sql) {
		System.out.println("��߷֣�"+android);
	}else {
		System.out.println("��߷֣�"+sql);
	}
}

}
