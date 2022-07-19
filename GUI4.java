import java.awt.*;

class MarvellousWindow extends Frame 
{
	public MarvellousWindow(String str, int x, int y) //Parameterized constructor
	{
		super(); //To access contents from constructor of Frame class
		setTitle(str);  //To give Name to window
		setSize(x,y);	//To give size to Window
		setVisible(true);	//To Display the window
	}
}

class GUI4
{
	public static void main(String arg[])
	{
		MarvellousWindow mobj1 = new MarvellousWindow("First",500,500); //moj1 for 1st window

		MarvellousWindow mobj2 = new MarvellousWindow("Second",200,200); //mobj2 for 2nd window
	}
}