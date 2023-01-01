package com.linecompare;

import java.util.Scanner;

public class  Linelength extends Line {
	void welcome() {
		System.out.println("welcome to line comparison problem using oops");
	}
	public void scannerclass() {
		   Linelength linelength=new Linelength();
		   Scanner sc=new Scanner(System.in);
		    
		   System.out.println("enter value of x1::");
		   double x1=sc.nextDouble();
		   System.out.println("enter value of x2::");
		   double x2=sc.nextDouble();
		   System.out.println("enter value of y1::");
		   double y1=sc.nextDouble();
		   System.out.println("enter value of y2::");
		   double y2=sc.nextDouble();
		   
		   linelength.userInput(x1,x2,y1,y2);
		   System.out.println("length of line x1,x2,y1,y2 :::"  + linelength.userInput(x1,x2,y1,y2));
		   
	
		
	}
	}
	
	
	

	
	

	
	


		
	
	
	

