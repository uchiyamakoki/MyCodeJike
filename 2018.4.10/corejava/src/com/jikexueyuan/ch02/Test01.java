package com.jikexueyuan.ch02;
/*
 * 用变量简化计算案例
 */
public class Test01 {

	/*
	 * (sqrt(20)+sqrt(10)/(sqrt(20)-sqrt(10)))
	 */
	/*
	 *public static void main(String[] args){
		//System.out.println("(sqrt(20)+sqrt(10))/(sqrt(20)-sqrt(10))="+Math.round(10*(Math.sqrt(20)+Math.sqrt(10))/(Math.sqrt(20)-Math.sqrt(10)))/10.0);
	System.out.println("(sqrt(20+sqrt(10)/sqrt(20)-sqrt(10))="+Math.round(10*(Math.sqrt(20)+Math.sqrt(10))/(Math.sqrt(20)-Math.sqrt(10)))/10.0);
	double sqrt20=Math.sqrt(20); //将20的平方根保存在sqrt20中
	double sqrt10=Math.sqrt(10);//将10的平方根保存在sqrt10中
	double result=(sqrt20+sqrt10)/(sqrt20-sqrt10);
	result=Math.round(result*10)/10.0;
	System.out.println("(sqrt(20+sqrt(10)/sqrt(20)-sqrt(10))="+result);
	} 
	 */
	public static void main(String[] args){
		//System.out.println("(sqrt(20)+sqrt(10))/(sqrt(20)-sqrt(10))="
	//+Math.round(10*(Math.sqrt(20)+Math.sqrt(10))/(Math.sqrt(20)-Math.sqrt(10)))/10.0);	//round只有保留整数为位
		double sqrt20=Math.sqrt(20);//将20的平方根保存在sqrt20中
		double sqrt10=Math.sqrt(10);//将10的平方根保存在sqrt10变量中
		double result=(sqrt20+sqrt10)/(sqrt20-sqrt10);
		result=Math.round(result*10)/10.0;
		System.out.println("(sqrt(20)+sqrt(10))/(sqrt(20)-sqrt(10))="+result);
		}
}
