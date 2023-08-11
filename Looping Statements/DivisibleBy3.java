package com.LoopingStatements;

public class DivisibleBy3 
{
	public static void main(String[] args)
	{
		int sum = 0;
		
		for(int i=300; i<=350; i++)
		{
			if(i%3 == 0)
			{
				sum = sum + i;	
			}
		}
		System.out.println("Sum of numbers divisible by 3 between 300 & 350 is: "+sum);
	}
}