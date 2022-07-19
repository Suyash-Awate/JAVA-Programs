import java.awt.*;
import java.awt.event.*;

class Suyash
{
	Frame fobj;
	Label hobj;
	Label sobj;
	Panel cobj;

	public Suyash()
	{
		fobj = new Frame("Marvellous Infosystems");
		fobj.setSize(700,700);
		fobj.setLayout(null);

		fobj.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent obj)
			{
				System.exit(0);
			}
		});

		hobj = new Label();
		hobj.setAlignment(Label.CENTER);

		sobj = new Label();
		sobj.setAlignment(Label.CENTER);
		sobj.setSize(350,100);

		cobj = new Panel();
		cobj.setLayout(null);

		fobj.add(hobj);
		fobj.add(cobj);
		fobj.add(sobj);
		fobj.setVisible(true);
	}

	public void Display()
	{
		hobj.setText("Please select batch");

		Button PPA = new Button("PPA");
		Button LB = new Button("LB");
		Button ANG = new Button("Angular");

		PPA.addActionCommand("PPA");
		LB.setActionCommand("LB");
		ANG.setActionCommand("Angular");

		PPA.addActionListener(new MyListener());
		LB.addActionListener(new Mylistener());
		ANG.addActionListener(new Mylistener());

		
	}
}



class MYGUI
{
	public static void main(String arg[])
	{
		Suyash sobj = new Suyash();
	}
}