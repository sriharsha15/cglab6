package com.cg.lab6.exercise7;

import java.io.File;

public class FileName {
	
	void display(String str)
	{
	File f=new File(str);
	  if (f.exists()) 
        System.out.println("Exists"); 
    else
        System.out.println("Does not Exists"); 
	  
	  if (f.canRead()) 
        System.out.println("Readable"); 
    else
        System.out.println("Does not Readable");
	  if (f.canWrite()) 
        System.out.println("Writeable"); 
    else
        System.out.println("Does not writeable");
	 
	     System.out.println(f.getName());
	  
	     System.out.println(f.length());
	}

}
