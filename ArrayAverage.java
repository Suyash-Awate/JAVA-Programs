/*
Write a java program which accepts N numbers from user and store it into Array and
display the average of all the numbers from array
*/

import java.util.*;
class ArrayAverage
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		CheckAverage obj = new CheckAverage();
		int arr[];
		int iSize = 0, iRet = 0, i = 0;

		System.out.println("Enter the size of the Array");
		iSize = sobj.nextInt();

		arr = new int[iSize];

		System.out.println("Enter the elements of Array");
		for(i = 0; i < arr.length; i++)
		{
			arr[i] = sobj.nextInt();
		}

		iRet = obj.Average(arr,iSize);
		System.out.println("Average is : "+iRet);
	}
}

class CheckAverage
{
	public int Average(int brr[], int iValue)
	{
		int iCount = 0, iAvg = 0;
		for(int i=0; i<brr.length; i++)
		{
			iCount = iCount + brr[i];
		}
		iAvg = iCount/iValue;

		return iAvg;
	}
}