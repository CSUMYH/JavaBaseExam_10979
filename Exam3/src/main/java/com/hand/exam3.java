package com.hand;

import java.util.Scanner;

public class exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input = new Scanner(System.in);
     System.out.println("请输入日期");
     String date = input.next();
     String yearString = date.trim().substring(0, 4);
     int year =Integer.parseInt(yearString) ;
     String monthString = date.trim().substring(5, 7);
     int month =Integer.parseInt(monthString) ;
     String dayString = date.trim().substring(8, 10);
     int day =Integer.parseInt(dayString) ;
     int days = 0;
     if((year%4==0&&year%100!=0) || year%400==0){
    	 switch(month) {
    	 	case 1 : 
    	 		days = day;
    	 		break;
    	 	case 2:
    	 		days=31+day;
    	 		break;
    	 	case 3:
    	 		days=31+29+day;
    	 		break;
    	 	case 4:
    	 		days=31+29+31+day;
    	 		break;
    	 	case 5:
    	 		days=31+29+31+30+day;
    	 		break;
    	 	case 6:
    	 		days=31+29+31+30+31+day;
    	 		break;
    	 	case 7:
    	 		days=31+29+31+30+31+30+day;
    	 		break;
    	 	case 8:  
    	 		days=31+29+31+30+31+30+31+day;
    	 		break;
    	 	case 9:	 	
    	 		days=31+29+31+30+31+30+31+31+day;
    	 		break;
    	 	case 10:
    	 		days=31+29+31+30+31+30+31+31+30+day;
    	 		break;
    	 	case 11:
    	 		days=31+29+31+30+31+30+31+31+30+31+day;
    	 		break;
    	 	case 12:
    	 		days=31+29+31+30+31+30+31+31+30+31+30+day;
    	 		break;   	 	
    	 } 
     }else{
    	 switch(month) {
 	 	case 1 : 
 	 		days = day;
 	 		break;
 	 	case 2:
 	 		days=31+day;
 	 		break;
 	 	case 3:
 	 		days=31+28+day;
 	 		break;
 	 	case 4:
 	 		days=31+28+31+day;
 	 		break;
 	 	case 5:
 	 		days=31+28+31+30+day;
 	 		break;
 	 	case 6:
 	 		days=31+28+31+30+31+day;
 	 		break;
 	 	case 7:
 	 		days=31+28+31+30+31+30+day;
 	 		break;
 	 	case 8:  
 	 		days=31+28+31+30+31+30+31+day;
 	 		break;
 	 	case 9:	 	
 	 		days=31+28+31+30+31+30+31+31+day;
 	 		break;
 	 	case 10:
 	 		days=31+28+31+30+31+30+31+31+30+day;
 	 		break;
 	 	case 11:
 	 		days=31+28+31+30+31+30+31+31+30+31+day;
 	 		break;
 	 	case 12:
 	 		days=31+28+31+30+31+30+31+31+30+31+30+day;
 	 		break;   	 	
 	 } 
     }
     System.out.println("你输入的日期是当年的第"+days+"天");
	}

}
