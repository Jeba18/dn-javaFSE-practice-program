package com;

public class Logger {
	private static Logger loggerobj;
	private Logger()
	{
		System.out.println("Logger Object Created");
	}
	public static Logger getInstance()
	{
		if(loggerobj==null)
		{
			loggerobj=new Logger();
		}
		return loggerobj;
	}
	public void print(String m)
	{
		System.out.println("Log Message: "+ m);
	}
}
