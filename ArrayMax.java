/*
Write a java program which accepts N numbers from user and store it into Array and
display the largest number from that array?
*/

import java.util.*;

class ArrayMax
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		CheckMax cobj = new CheckMax();
		int iRet = 0;
		int iValue = 0;
		int Arr[];

		System.out.println("Enter number of elements : ");
		iValue = sobj.nextInt();

		Arr = new int [iValue];

		System.out.println("Enter the elements of Array");
		for(int i=0; i<Arr.length; i++)
		{
			Arr[i] = sobj.nextInt();
		}

		iRet = cobj.Max(Arr);
		System.out.println("Maximum number is : "+iRet);
	}
}

class CheckMax
{
	public int Max(int Brr[])
	{
		int iMax = 0;
		for(int i=0; i<Brr.length; i++)
		{
			if(Brr[i] > iMax)
			{
				iMax = Brr[i];
			}
		}
		return iMax;
	}
}