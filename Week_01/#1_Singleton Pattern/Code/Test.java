package com;

public class Test {
public static void main(String args[])
{
	Logger obj1=Logger.getInstance();
	obj1.print("First Message");
	Logger obj2=Logger.getInstance();
	obj2.print("Second Message");
	Logger obj3=Logger.getInstance();
	obj3.print("Third Message");
	if(obj1==obj2 && obj2==obj3)
	{
		System.out.println("Only one instance of Logger is created and used across the application");
	}
	else
	{
		System.out.println("Failed as Singleton Pattern");
	}
}
}
