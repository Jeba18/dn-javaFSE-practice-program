package com;

public class DocumentFactory {
public Document creating (String doct)
{
	if(doct.equals("word"))
	{
		return new WordDocument();
	}
	else if(doct.equals("pdf"))
	{
		return new PdfDocument();
	}
	else if(doct.equals("excel"))
	{
		return new ExcelDocument();
	}
	else
	{
		System.out.println("Enter Proper Document Name!");
	}
	return new WordDocument();
}
}
