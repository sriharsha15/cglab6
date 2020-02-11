package com.cg.lab6.exercise7;

import java.util.Scanner;
public class FileMain {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  String str=sc.nextLine();
	  FileName obj=new FileName();
	  obj.display(str);
	  
	       sc.close();

	}

}
