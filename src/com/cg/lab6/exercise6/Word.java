package com.cg.lab6.exercise6;

import java.io.*;

public class Word {
	void display(String str)
	{
		try {
			int lines=1,chars=1,words=1;
			int code=0;
			FileInputStream fis=new FileInputStream(str);
			while(fis.available()!=0)
			{
				code=fis.read();
				
				if(code=='\n')
					lines++;
				if(code=='\t' || code==' ' || code=='\n')
					++words;
				if(chars!=0)
					chars++;
//				if(code!=10)
//					chars++;
//					if(code==32)
//					words++;
//					if(code==13)
//					{
//						lines++;
//						words++;
//					}
				}
				System.out.println("No.of characters = "+chars);
				System.out.println("No.of words = "+(words));
				System.out.println("No.of lines = "+(lines));
				fis.close();
			}
		 catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
