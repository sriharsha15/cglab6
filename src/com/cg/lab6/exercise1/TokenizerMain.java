package com.cg.lab6.exercise1;

import java.util.Scanner;

public class TokenizerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Tokenizer obj=new Tokenizer();
		obj.display(str);
		sc.close();

	}

}
