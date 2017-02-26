import java.awt.FlowLayout;
import java.awt.event.*;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;

public class MapMaker_GUI implements Observer {
	private mapState mapstate;
	
	mapPanel mappanel;
	MapGrid mapGrid;
	
	private JFrame frame;
	private JMenuBar menubar;
	private JMenu file, help;
	private JMenuItem newFile, open, save, close;
	private JTextField mapSize;
	
	public MapMaker_GUI(mapState g){
		this.mapstate = g;
		mapstate.addObserver(this);
		mapGrid = g.getMapGrid();
		
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1920, 1080);		//set window size
		frame.setTitle("MapMaker");
		
		thePanel();
		theMenu();	
		menuButton1();
		menuButton2();
		textBar();
		springLayout();
		
		frame.setVisible(true);
	}
	
	public void thePanel(){
		mappanel = new mapPanel(mapGrid);
		frame.add(mappanel);
	}

	
	public void theMenu(){
		menubar = new JMenuBar();
		frame.add(menubar);		
				
	}
	
	public void menuButton1(){
		file = new JMenu("File");
		menubar.add(file);
		newFile = new JMenuItem("New");
		open = new JMenuItem("Open");
		save = new JMenuItem("Save");
		file.add(newFile);
		file.add(open);
		file.add(save);

	}
	
	public void menuButton2(){
		help = new JMenu("Help");
		menubar.add(help);
		close = new JMenuItem("Close");
		help.add(close);

	}
	
	public void textBar(){
		mapSize = new JTextField("x,y map size");
		menubar.add(mapSize);

	}
	
	public void springLayout(){
	    SpringLayout layout = new SpringLayout();
	    frame.setLayout(layout);
	    
	    layout.putConstraint(SpringLayout.NORTH, mappanel, 10, SpringLayout.SOUTH, menubar);


	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
	
	
		
}
