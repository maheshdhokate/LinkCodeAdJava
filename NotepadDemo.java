import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class NotepadDemo extends JFrame implements ActionListener
{
	//JPanel p1,p2,p3,p4,p5;
	
	JTextArea ta;
	//JPanel p1;
	MenuBar mb;
	Menu menu1, menu2, menu3, menu4, menu5;
	MenuItem mif1, mif2, mif3, mif4, mie1, mie2, mie3, mie4, mifr1, mifr2, miv1, mih1, mih2;

	NotepadDemo()
	{
		super("Welcome");
		setSize(400,400);
		setVisible(true);
		
		ta=new JTextArea();
		add(BorderLayout.CENTER,ta);
		//p1=new JPanel();

		mb=new MenuBar();

		menu1=new Menu("File");
		menu2=new Menu("Edit");		
		menu3=new Menu("Format");
		menu4=new Menu("View");
		menu5=new Menu("Help");

		mie1=new MenuItem("Undo      Ctrl+Z");
		mie2=new MenuItem("Cut       Ctrl+X");
		mie3=new MenuItem("Copy      Ctrl+C");
		mie4=new MenuItem("Paste     Ctrl+V");

		mif1=new MenuItem("New        Ctrl+N");
		mif2=new MenuItem("Save       Ctrl+S");
		mif3=new MenuItem("Open       Ctrl+O");
		mif4=new MenuItem("Exit        ");

		mifr1=new MenuItem("Word Wrap");
		mifr2=new MenuItem("Font");

		miv1=new MenuItem("Status Bar");

		mih1=new MenuItem("View Help");
		mih2=new MenuItem("About Notepad");

		menu1.add(mif1);
		menu1.add(mif2);
		menu1.add(mif3);
		menu1.add(mif4);


		menu2.add(mie1);
		menu2.add(mie2);
		menu2.add(mie3);
		menu2.add(mie4);


		menu3.add(mifr1);
		menu3.add(mifr2);

		menu4.add(miv1);

		menu5.add(mih1);
		menu5.add(mih2);

		mb.add(menu1);
		mb.add(menu2);
		mb.add(menu3);
		mb.add(menu4);
		mb.add(menu5);

		//p1.add(mb);
		setMenuBar(mb);
		
		mif1.addActionListener(this);
		mif2.addActionListener(this);
		//getContentPane().add(p1);
	}

		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==mif1)
			{
				NotepadDemo n=new NotepadDemo();
			}
			if(e.getSource()==mif2)
			{
				ta.setText("ABABABABABA");
			}
		}

		public static void main(String args[])
		{
			new NotepadDemo();
		}	

}