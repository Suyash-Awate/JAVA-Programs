class MultiDimensional
{
	public static void main(String args[])
	{
		//int arr[3][2];

		int arr[][] = new int[3] [2];

		//arr is 2 dimensional array 
		//which contains 3 one dimensional array 
		//each one dimensional array contains 
		//2 elements and each elememt is of type integer

		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 30;
		arr[1][1] = 40;
		arr[2][0] = 50;
		arr[2][1] = 60;

		System.out.println(arr[0][0]);		// 10
		System.out.println(arr[2][1]);		// 60
		System.out.println(arr.length);		// 3
		System.out.println(arr[0].length);	// 2

		for(int i=0; i<arr.length; i++)	//Loop 1
		{
			for(int j=0; i<arr[i].length; j++)	//Loop 2
			{
				System.out.println(arr [i][j]);
			}
		}
		//O(M*N)
		//M is number of rows 		3
		//N is number of colounms	2
	}
}