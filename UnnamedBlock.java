class UnnamedBlock
{
	public static void main(String arg[])
	{
		Demo obj1 = new Demo();
		Demo obj2 = new Demo(11,21);
	}
}

class Demo
{
	public int i,j;
	public static int x,y;

	{
		System.out.println("Inside Unnamed Block");
		i = 10;
		j = 20;
		//Common Logic
	}

	public Demo()
	{
		System.out.println("Inside Default Constructor");
	}
	public Demo(int a, int b)
	{
		System.out.println("Inside parameterized constructor");
	}

	static
	{
		System.out.println("Inside static block");
		x = 10;
		y = 20;
	}
}