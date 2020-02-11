package com.cg.lab6.exercise3;

import java.util.Scanner;

public class MirrorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
        Mirror obj=new Mirror();
       System.out.println(obj.getImage(str));
		sc.close();

	}

}
