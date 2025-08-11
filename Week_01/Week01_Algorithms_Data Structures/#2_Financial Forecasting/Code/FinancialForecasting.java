package com;
import java.util.Scanner;
public class FinancialForecasting {

	public static double futurevalue(int n,double current,double rate)
	{
		if(n==0)
		{
			return current;
		}
		return futurevalue(n-1,current,rate)*(1+rate);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Years: ");
		int n=sc.nextInt();
		System.out.println("Enter current value & annual growth: ");
		double c=sc.nextDouble();
	    double r=sc.nextDouble();
	    double res=futurevalue(n,c,r);
	    System.out.println("Predicted Future value after "+n+" years is "+res);

	}

}
