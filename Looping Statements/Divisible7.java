package com.LoopingStatements;

import java.util.*;

public class Divisible7 
{
	public static void main(String[] args)
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int iNum = sobj.nextInt();
		
		if(iNum%7 == 0)
		{
			System.out.println("Number is divisible by 7");
		}
		else
		{
			System.out.println("not divisible by 7");
		}
	}
}
