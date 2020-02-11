package com.cg.lab6.exercise6;

import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Word obj=new Word();
	    obj.display(str);
	    sc.close();
		
	}

}
