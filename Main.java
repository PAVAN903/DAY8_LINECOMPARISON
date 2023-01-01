package com.linecompare;

import java.util.Scanner;

public class Main {
	
	
	public static  void main(String[] args) {
		Linelength linelength=new Linelength();
		linelength.welcome();
		linelength.scannerclass();
		 System.out.println("Enter Line 'A' co-ordinator's ");
	      double lineA=linelength.scanner();
	      System.out.println("Enter Line 'B' co-ordinator's ");
	      double lineB=linelength.scanner();
	      if(lineA==lineB)
	      {
	    	  System.out.println("Line A and Line B are Equal");
	      }
	      else {
	    	  System.out.println("Line A and Line B are Not Equal");
	      }
	     Lines compare=new Lines();
	     compare.compare(lineA ,lineB);
	      
	}}
