package com.cg.lab6.exercise9;

import java.util.Scanner;


public class DateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int years=sc.nextInt();
		int date=sc.nextInt();
		int month=sc.nextInt();
		
		DateAdd obj= new DateAdd();
		obj.acceptDate(years,month,date);
		sc.close();

	}

}
