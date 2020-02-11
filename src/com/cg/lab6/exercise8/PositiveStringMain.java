package com.cg.lab6.exercise8;

import java.util.Scanner;

public class PositiveStringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		PositiveString obj=new PositiveString();
		System.out.println(obj.positive(str));
		sc.close();

	}

}
