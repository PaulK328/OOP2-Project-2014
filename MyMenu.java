//MyMenu.java

import javax.swing.*;
import java.awt.event.*;

public class MyMenu extends JFrame implements ActionListener{
	
	private JMenuBar jmenubar; //Declare outside, as it can be used accross all methods
	
	public MyMenu(){
		setTitle("My GUI"); //Title Of GUI
		setSize(300,300); //Size Of GUI
		setLocation(300,400); //Location On Screen Of GUI
		setDefaultCloseOperation(EXIT_ON_CLOSE); //Close On Exit
			
		jmenubar = new JMenuBar(); //Creating Menu, new JMenuBar();
		setJMenuBar(jmenubar);
		
		CreateFileMenu();
		CreateCharacterMenu();	
	} //End of MyMenu
	
	/* File MenuBar + Items */
	public void CreateFileMenu(){
		JMenu filemenu = new JMenu("File"); //Creating the words in the JMenuBar
		jmenubar.add(filemenu);
		
		/* Adding Items To The 'File' MenuBar */
		
		JMenuItem newitem = new JMenuItem("New"); //Creating of item under 'File'
		filemenu.add(newitem); //Adding of item
		newitem.addActionListener(this);
		
		JMenuItem open = new JMenuItem("Open");
		filemenu.add(open);
		open.addActionListener(this);
		
		JMenuItem close = new JMenuItem("Close");
		filemenu.add(close);
		close.addActionListener(this);
		
		JMenuItem saveas = new JMenuItem("Save As");
		filemenu.add(saveas);
		saveas.addActionListener(this);
		
		filemenu.addSeparator(); //Seperator
		
		JMenuItem quit = new JMenuItem("Quit");
		filemenu.add(quit);
		quit.addActionListener(this);	
	} //End of 'CreateFileMenu'
	
	/* Character MenuBar + Items */
	public void CreateCharacterMenu(){
		JMenu charactermenu	= new JMenu("Character");
		jmenubar.add(charactermenu);
		
		/* Adding Items To The 'Character' MenuBar */
		
		JMenuItem first = new JMenuItem("First"); //Creating of item under 'Character'
		charactermenu.add(first);	//Adding of item
		first.addActionListener(this);
		
		JMenuItem second = new JMenuItem("Second");
		charactermenu.add(second);
		second.addActionListener(this);
		
		charactermenu.addSeparator(); //Seperator
		
		JMenuItem third = new JMenuItem("Third");
		charactermenu.add(third);
		third.addActionListener(this);
	} //End of 'CreateCharaterMenu'
	
	public static void main(String [] args){
		MyMenu menu = new MyMenu();
		menu.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		
		//'File' menu items
		
		if(e.getActionCommand().equals("New")){
			JOptionPane.showMessageDialog(null, "You Clicked On New");
		}
		else if(e.getActionCommand().equals("Open")){
			JOptionPane.showMessageDialog(null, "You Clicked On Open");
		}
		else if(e.getActionCommand().equals("Close")){
			JOptionPane.showMessageDialog(null, "You Clicked On Close");
		}
		else if(e.getActionCommand().equals("Save As")){
			JOptionPane.showMessageDialog(null, "You Clicked On Save As");
		}
		else if(e.getActionCommand().equals("Quit")){
			System.exit(0);
		}
		
		//'Character' menu items
		
		else if(e.getActionCommand().equals("First")){
			JOptionPane.showMessageDialog(null, "You Clicked On The First Link");
		}
		else if(e.getActionCommand().equals("Second")){
			JOptionPane.showMessageDialog(null, "You Clicked On The Second Link");
		}
		else if(e.getActionCommand().equals("Third")){
			JOptionPane.showMessageDialog(null, "You Clicked On The Third Link");
		}
	}//End of 'actionPerformed'
}//End