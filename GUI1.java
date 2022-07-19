import java.awt.*;

class MarvellousWindow extends Frame 
{
	public MarvellousWindow(String str)	//Parameterized Constructor
	{
		super(str);	//Calling parameterized constructor of Frame class 
	}
}

class GUI1
{
	public static void main(String arg[])
	{
		MarvellousWindow mobj = new MarvellousWindow("Marvellous");	//object of MarvellousWindow and passing parameters to the constructor
		mobj.setSize(300,300);	//To give size to Window
		mobj.setVisible(true);	//To Display the window
	}
}