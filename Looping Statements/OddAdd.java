package com.LoopingStatements;

public class OddAdd 
{
	public static void main(String[] args)
	{
		int sum = 0;
	
		for(int i=10; i<=20; i++)
		{
			if(i%2 != 0)
			{
				sum = sum+i;
			}
		}
		System.out.println("Addition of odd numbers between 10 & 20 is : "+sum);
	}
}