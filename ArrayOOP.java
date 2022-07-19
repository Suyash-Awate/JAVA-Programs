import java.util.*;

class Array 
{
	Scanner sobj = new Scanner(System.in);
	public int arr[]; //Resources

	public Array(int iSize)	//Contructor
	{
		arr = new int[iSize];  //To allocate resources
	}


	 public void Accept()
	 {
	 	System.out.println("Enter the Elements ");
	 	for(int i =0; i<arr.length; i++)
	 	{
	 		arr[i] = sobj.nextInt();
	 	}
	 }
	 public int Addition()
	 {
	 	int iSum = 0;
	 	for(int i=0; i<arr.length; i++)
	 	{
	 		iSum = iSum + arr[i];	 	
	 	}
	 	return iSum;
	 }
}

class ArrayOOP
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the number of Elements");
		int size = sobj.nextInt();

		Array obj = new Array(size);

		obj.Accept();

		int iRet = obj.Addition();
		System.out.println("Addition is : "+iRet);
	}
}