package com.ControlStatement;

/*
	e 
	e d 
	e d c 
	e d c b 
	e d c b a 
*/

public class Employee 
{
	public static void main(String[] args) 
	{
		int salary = 50000;
		int DA = (salary * 10)/100;
		int HRA = (salary * 20)/100;
		int PF = (salary * 15)/100;
		int PT = (salary * 10)/100;
		int TA = (salary * 15)/100;
		
		float gross = salary + DA + HRA + TA;
		float net = gross - (PF + PT);
		
		System.out.println("Gross salary of employee is : "+gross);
		System.out.println("Net salary of employee is : "+net);
	}
}
