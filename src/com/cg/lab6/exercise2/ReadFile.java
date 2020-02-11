package com.cg.lab6.exercise2;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	void display(String str)
	{
		File f=new File(str);
		try(Scanner scan=new Scanner(f))
		{
			
			int i=1;
	    	 while(scan.hasNext())
	    	  System.out.println(i+++"-->"+scan.nextLine());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
