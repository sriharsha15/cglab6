package com.cg.lab6.exercise5;

import java.util.Scanner;

public class DigitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number1=sc.nextInt();
		Digit obj=new Digit();
		System.out.println(obj.modifyNumber(number1));
        sc.close();
	}

}
