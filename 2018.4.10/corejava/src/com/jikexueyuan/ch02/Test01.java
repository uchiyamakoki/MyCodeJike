package com.jikexueyuan.ch02;
/*
 * �ñ����򻯼��㰸��
 */
public class Test01 {

	/*
	 * (sqrt(20)+sqrt(10)/(sqrt(20)-sqrt(10)))
	 */
	/*
	 *public static void main(String[] args){
		//System.out.println("(sqrt(20)+sqrt(10))/(sqrt(20)-sqrt(10))="+Math.round(10*(Math.sqrt(20)+Math.sqrt(10))/(Math.sqrt(20)-Math.sqrt(10)))/10.0);
	System.out.println("(sqrt(20+sqrt(10)/sqrt(20)-sqrt(10))="+Math.round(10*(Math.sqrt(20)+Math.sqrt(10))/(Math.sqrt(20)-Math.sqrt(10)))/10.0);
	double sqrt20=Math.sqrt(20); //��20��ƽ����������sqrt20��
	double sqrt10=Math.sqrt(10);//��10��ƽ����������sqrt10��
	double result=(sqrt20+sqrt10)/(sqrt20-sqrt10);
	result=Math.round(result*10)/10.0;
	System.out.println("(sqrt(20+sqrt(10)/sqrt(20)-sqrt(10))="+result);
	} 
	 */
	public static void main(String[] args){
		//System.out.println("(sqrt(20)+sqrt(10))/(sqrt(20)-sqrt(10))="
	//+Math.round(10*(Math.sqrt(20)+Math.sqrt(10))/(Math.sqrt(20)-Math.sqrt(10)))/10.0);	//roundֻ�б�������Ϊλ
		double sqrt20=Math.sqrt(20);//��20��ƽ����������sqrt20��
		double sqrt10=Math.sqrt(10);//��10��ƽ����������sqrt10������
		double result=(sqrt20+sqrt10)/(sqrt20-sqrt10);
		result=Math.round(result*10)/10.0;
		System.out.println("(sqrt(20)+sqrt(10))/(sqrt(20)-sqrt(10))="+result);
		}
}