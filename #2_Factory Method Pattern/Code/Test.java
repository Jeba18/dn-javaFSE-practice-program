package com;

public class Test {
public static void main(String args[])
{
	DocumentFactory fact=new DocumentFactory();
	Document obj1=fact.creating("pdf");
	obj1.open();
	Document obj2=fact.creating("word");
	obj2.open();
	Document obj3=fact.creating("excel");
	obj3.open();
}
}
