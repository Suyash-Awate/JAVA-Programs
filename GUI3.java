import java.awt.*;

class MarvellousWindow extends Frame 
{
	public MarvellousWindow()
	{
		super();
		setTitle("Marvellous");  //To give Name to window
		setSize(400,400);	//To give size to Window
		setVisible(true);	//To Display the window
	}
}

class GUI3
{
	public static void main(String arg[])
	{
		MarvellousWindow mobj1 = new MarvellousWindow(); //moj1 for 1st window

		MarvellousWindow mobj2 = new MarvellousWindow(); //mobj2 for 2nd window
	}
}