package com.cg.lab6.exercise10;

import java.util.Scanner;

public class ApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String username=sc.nextLine();
      Application obj=new Application();
      System.out.println(obj.validate(username));
      sc.close();
	}

}
