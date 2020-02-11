package com.cg.lab6.exercise4;

import java.util.Scanner;

public class ConsonantsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Consonants obj=new Consonants();
		System.out.println(obj.alterString(str));
		sc.close();
	}

}
