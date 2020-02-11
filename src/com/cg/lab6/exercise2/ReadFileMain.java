package com.cg.lab6.exercise2;

import java.util.Scanner;

public class ReadFileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str= sc.nextLine();
		ReadFile obj=new ReadFile();
		obj.display(str);
		sc.close();
	}

}
