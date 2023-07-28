package com.operator;

public class Student 
{
	public static void main(String [] args)
	{
		String name = "Suyash";
		int maths = 39;
		int phy = 55;
		int chem = 58;
		int bio = 73;
		int comp = 87;
		
		int total = maths+phy+chem+bio+comp;

		float percentage = total/5;
		
		System.out.println("Percentage of "+name+"-> " +percentage+"%");
	}
}