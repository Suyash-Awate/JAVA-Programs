package com.LoopingStatements;

public class CountDigits 
{
	public static void main(String[] args) 
	{
		int iNum = 4232;
		int n = 0;
		int iRes = 0;
		
		while(iNum > 0)
		{
			n = iNum%10;
			iRes++;
			iNum = iNum/10;
		}
		System.out.println("Number of digits are : "+iRes);
	}
}