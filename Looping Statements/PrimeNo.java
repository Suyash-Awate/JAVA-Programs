package com.LoopingStatements;

public class PrimeNo 
{
	public static void main(String[] args) 
	{
		int iNum = 10;
		int isPrime = 0;
		
		for(int i=2; i<=iNum; i++)
		{
			if(iNum%i == 0)
			{
				isPrime++;
			}
		}
		if(isPrime == 1)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not a Prime number");
		}
	}
}