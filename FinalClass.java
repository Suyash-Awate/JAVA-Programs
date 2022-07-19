class FinalClass
{
	public static void main(String arg[])
	{
		Base bobj = new Base();
		bobj.fun();
		Demo dobj = new Demo();
		dobj.gun();
	}
}

final class Base   // <-------
{
	public int i;
	public void fun()
	{
		System.out.println("Base fun");
	}
}

//class Derived extends Base {}		ERROR we cannot inherit

class Demo
{
	public Base bobj;  //Reference
	public Demo()
	{
		bobj = new Base();	//Object of Base class
	}
	public void gun()
	{
		bobj.fun();
	}
}