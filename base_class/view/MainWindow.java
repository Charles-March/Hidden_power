package view;

import javax.swing.JFrame;

public class MainWindow extends JFrame{
	private static final long serialVersionUID = -4590378643760154293L;
	
	/**
	 * 0. mainMenu
	 * 1. inGame
	 * 2. inventory
	 */
	private ViewPannel vp;
	
	public MainWindow(String title,int X, int Y){
		super(title);
		this.setSize(X, Y);
		vp = new ViewPannel(X, Y);
		
		this.setVisible(true);
	}
	
	public void mainMenu(){
		vp.setState(0);
	}
	
	public void inventory(){
		vp.setState(2);
	}
	
	public void game(){
		vp.setState(1);
	}
}
