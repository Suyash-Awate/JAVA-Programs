/*
Write a java program which creates Jagged array. Number of rows and size of each
row should be accepted from user?
*/

import java.util.*;
class JaggedArray
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		Jagged obj = new Jagged();
		int arr[][];
		int iRet = 0, iRow = 0, iCol = 0;

		System.out.println("Enter Number of Rows");
		iRow = sobj.nextInt();
		System.out.println("Enter Number of Coloumn");
		iCol = sobj.nextInt();

		arr = new int[iRow][iCol];

		System.out.println("Enter the elements of Array");
		for(int i = 0; i<iRow; i++)
		{
			for(int j = 0; j<iCol; j++)
			{
				arr[i][j] = sobj.nextInt();
			}
		}
		obj.ArrayJagged(arr);
	}
}

class Jagged
{
	public void ArrayJagged(int Brr[][])
	{
		for(int i = 0; i<iRow; i++)
		{
			for(int j = 0; j<iCol; j++)
			{
				System.out.println(brr[i][j]);
			}
		}
	}
}