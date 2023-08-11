package com.LoopingStatements;

public class DivisibleBy_5 
{
	public static void main(String[] args)
	{
		int sum = 0;
		
		for(int i=50; i<=100; i++)
		{
			if(i%5 == 0)
			{
				sum = sum + i;	
			}
		}
		System.out.println("Sum of numbers divisible by 5 between 50 & 100 is: "+sum);
	}
}
