package com.LoopingStatements;

public class ReverseNumber 
{
	public static void main(String[] args)
	{
		int iNum = 352;
		int No = 0;
		
		while(iNum > 0)
		{
			No = (No*10)+iNum%10;
			iNum = iNum/10;
		}
		
		System.out.println(No);
	}
}