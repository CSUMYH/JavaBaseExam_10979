package com.hand;

import java.util.ArrayList;

public class exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countSuShu();
	}
	public static void countSuShu(){
		ArrayList <Integer> list = new ArrayList<Integer>();
		for(int i=101;i<=200;i++){
			int count = 0;
			for(int j=1;j<=i;j++){
				if(i%j==0){
					count++;
				}		
			}
			if(count==2){
				list.add(i);
			}
		}
		
		System.out.println("101-200֮�乲��"+list.size()+"������");
		System.out.println("�ֱ��� ��");
		for(int i =0;i<list.size();i++){
			System.out.print(" "+list.get(i));
		}
		
	}
}
