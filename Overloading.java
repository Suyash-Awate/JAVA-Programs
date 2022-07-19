import java.lang.*;

class Overloading
{
	public static void main(String Arg[])
	{
		System.out.println("Inside Main");
		Demo obj = new Demo();
		
		int iRet = 0;
		float fRet = 0.0f;

		iRet = obj.Add(10,11);
		System.out.println("Addition of 2 Intergers :" +iRet);


		fRet = obj.Add(10.5f,11.3f);
		System.out.println("Addition of 2 Floats :" +fRet);


		iRet = obj.Add(10,11,30);
		System.out.println("Addition 3 Intergers :" +iRet);


		obj.fun(10,11.3f);	//First fun

		obj.fun(11.3f,10);	//Second fun
	}
}

class Demo
{
	//Overloading by changing the DATATYPE
	public int Add(int no1, int no2)
	{
		return no1+no2;
	}
	public float Add(float no1, float no2)
	{
		return no1+no2;
	}


	//Overloading by changing NUMBER of arguments
	public int Add(int no1, int no2,int no3)
	{
		return no1+no2+no3;
	}


	//Overloading by changing SEQUENCE of arguments	
	public void fun(int i, float f)
	{
		System.out.println("Inside First fun");
	}
	public void fun(float f,int i)
	{
		System.out.println("Inside Second fun");
	}
}
