package view;

import java.awt.Graphics;

import javax.swing.JPanel;

public class ViewPannel extends JPanel{
	private static final long serialVersionUID = 2505281862606170306L;
	
	private int sizeX,sizeY;
	private int state;
	
	public ViewPannel(int X,int Y){
		super();
		sizeX = X;
		sizeY = Y;
	}
	
	public void setState(int i){
		if(state != i){
			state=i;	
			this.repaint();
		}
	}
	
	public void printMenu(Graphics g){
		
	}
	
	public void printMap(Graphics g){
		
	}
	
	public void printInventory(Graphics g){
		
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		switch(state){
			case 0:
				printMenu(g);
			break;
			
			case 1:
				printMap(g);
			break;
			
			case 2:
				printInventory(g);
			break;
		}
	}
	
}
