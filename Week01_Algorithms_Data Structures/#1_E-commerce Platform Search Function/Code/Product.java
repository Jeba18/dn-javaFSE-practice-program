package com;

import java.util.Arrays;      
import java.util.Comparator;   


public class Product {
int productId;
String productName;
String category;
public Product (int i,String s1,String s2)
{
	this.productId=i;
	this.productName=s1;
	this.category=s2;
}
public String toString()
{
	return productId+" -> "+productName+" ("+category+")";
}

public static Product linear(Product prod[],String key)
{
	for(Product p: prod)
	{
		if(p.productName.equals(key))
		{
			return p;
		}
		
	}
	return null;
}
public static Product binary(Product prod[],String key)
{
	Arrays.sort(prod, Comparator.comparing(p->p.productName.toLowerCase()));
	int l,r,m;
	l=0;
	r=prod.length-1;
	
	while(l<r)
	{
		m=l+(r-l)/2;
		int com=prod[m].productName.compareTo(key);
		if(com==0) return prod[m];
		else if(com<0) l=m+1;
		else r=m+1;
	}
	return null;
}
public static void main(String args[])
{
	Product arr[]= {new Product(1,"Pen","Stationery"),new Product(2,"Phone","Electronics"), new Product(3,"Ball","Sports"),new Product(4,"Book","Study Materials")};
	String k="Ball";
	Product res= linear (arr,k);
	if(res== null)
	{
		System.out.println("Product not Found!");
	}
	else
	{
		System.out.println("Product "+res+" is Founded");
	}
	Product res1=binary(arr,k);
	if(res== null)
	{
		System.out.println("Product not Found!");
	}
	else
	{
		System.out.println("Product "+ res +" is Founded");
	}
}
}
