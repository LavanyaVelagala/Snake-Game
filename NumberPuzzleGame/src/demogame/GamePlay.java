package demogame;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePlay extends JPanel{
	private boolean play=false;
	private int totalBrick=21;
	private Timer timer;
	private int delay=8;
	private int Xball=120;
	private int Yball=350;
	private int XballDir=-1;
	private int YballDir=-2;
	private int playerX=350;
	
	
	public GamePlay() {
		
	}
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(1,1,692,592);
		
		g.setColor(Color.blue);
		g.fillRect(0, 0, 692, 3);
		g.fillRect(0, 3, 3, 592);
		g.fillRect(691, 3, 3, 592);
		
		
		
	}
	
	 
}
