package com.LoopingStatements;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		int No = 1223;
		int temp = No;
		int Rev = 0;
		
		while(No > 0)
		{
			Rev = (Rev*10)+No%10;
			No = No/10;
		}
		if(Rev == temp)
		{
			
			System.out.println("It is a palindrome number");
		}
		else
		{
			System.out.println("It is not a palindrome number");
		}
	}
}