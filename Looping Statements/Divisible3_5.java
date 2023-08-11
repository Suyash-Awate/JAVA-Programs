package com.LoopingStatements;

import java.util.Scanner;
public class Divisible3_5 
{
	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int iNum = sobj.nextInt();
		
		if((iNum%3==0)&&(iNum%5==0))
		{
			System.out.println("Number is divisible by 3 & 5");
		}
		else
		{
			System.out.println("Number not is divisible by 3 & 5");
		}
	}
}