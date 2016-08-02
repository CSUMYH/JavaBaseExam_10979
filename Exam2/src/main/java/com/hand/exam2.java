package com.hand;

import java.util.Scanner;

public class exam2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入工资 ：");
		double salary = input.nextDouble();
		System.out.println("应缴纳的税费为："+salaryshui(salary));
	}
	
	public static double salaryshui(double salary){
		double value = salary-3500;
		double  tallage=0; 
		if(value>0&&value<=1500){
			tallage =value*0.03;
		}else if(value>1500&&value<=4500){
			tallage=1500*0.03+(value-1500)*0.1;
		}else if(value>4500&&value<=9000){
			tallage=1500*0.03+(4500-1500)*0.1+(value-4500)*0.2;
		}else if(value>9000&&value<=35000){
			tallage=1500*0.03+(4500-1500)*0.1+(9000-4500)*0.2+(value-9000)*0.25;
		}else if(value>35000&&value<=55000){
			tallage=1500*0.03+(4500-1500)*0.1+(9000-4500)*0.2+(35000-9000)*0.25+(value-35000)*0.3;
		}else if(value>55000&&value<=80000){
			tallage=1500*0.03+(4500-1500)*0.1+(9000-4500)*0.2+(35000-9000)*0.25+(55000-35000)*0.3+(value-55000)*0.35;
		}else if(value>80000){
			tallage=1500*0.03+(4500-1500)*0.1+(9000-4500)*0.2+(35000-9000)*0.25+(55000-35000)*0.3+(80000-55000)*0.35+(value-80000)*0.45;    
	}
		return tallage;
}
}
