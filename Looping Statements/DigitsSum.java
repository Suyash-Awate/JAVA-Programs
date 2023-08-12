package com.LoopingStatements;

public class DigitsSum 
{
	public static void main(String[] args) 
	{
		int no = 341;
		int sum = 0;
		int n = 0;
		
		while (no > 0)
		{
			n = no%10;
			sum = sum + n;
			no = no/10;
		}
		System.out.println("Sum of digits is : "+sum);
	}
}