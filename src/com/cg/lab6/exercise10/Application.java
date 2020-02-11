package com.cg.lab6.exercise10;

public class Application {
	boolean validate(String username) 
	{
		if(username.endsWith("_job")&&username.length()>=12)
		{
			return true;
		}
		return false;
	}

}
