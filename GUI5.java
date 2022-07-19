import java.awt.*;

class MarvellousWindow extends Frame 
{
	Button b1;
	TextField t1;

	public MarvellousWindow(String str, int x, int y)
	{
		super();
		setTitle(str);
		setSize(x,y);

		b1 = new Button("Submit"); //To create button named Submit
		t1 = new TextField();  //To create text field
		b1.setBounds(50,50,100,50);
		t1.setBounds(50,150,100,50);

		add(b1);  //To add button to the window
		add(t1);
		setLayout(null);
		setVisible(true);
	}
}

class GUI5
{
	public static void main(String arg[])
	{
		MarvellousWindow mobj1 = new MarvellousWindow("First",500,500);
	}
}