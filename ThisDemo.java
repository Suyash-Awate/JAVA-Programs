import java.lang.*;

class ThisDemo
{
	public static void main(String arg[])
	{
		Demo obj = new Demo(10,20);
	}
}

class Demo
{
	public int x,y;

	public Demo()
	{
		//this(10,20);
		System.out.println("Default Constructor");
	}
	public Demo(int a,int b)
	{
		this();		//Use no1
		System.out.println("Parameterized Constructor");
		this.x = a;
		this.y = b;
	}
	public void fun()
	{
		System.out.println("Inside fun");
		System.out.println("Value of x : "+this.x);		//Use no2
	}
	public void gun()
	{
		System.out.println("Inside gun");
		this.fun();		//Use no3
	}
}