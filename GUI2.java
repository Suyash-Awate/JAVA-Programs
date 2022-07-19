import java.awt.*;

class MarvellousWindow extends Frame 
{
	public MarvellousWindow()
	{
		super();
	}
}

class GUI2
{
	public static void main(String arg[])
	{
		MarvellousWindow mobj = new MarvellousWindow();
		mobj.setSize(300,300);	//To give size to Window
		mobj.setTitle("Marvellous");  //To give Name to window
		mobj.setVisible(true);	//To Display the window
	}
}