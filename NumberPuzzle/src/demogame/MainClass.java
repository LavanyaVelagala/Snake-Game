package demogame;
import javax.swing.JFrame;

public class MainClass {
	public static void main(String[] args) 
	{ 
		
		JFrame j =new JFrame();
		j.setTitle("Break Ball");
		j.setSize(700,600);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setResizable(false);
		j.setVisible(true);;
		j.setLocationRelativeTo(null);
		
		
		GamePlay gamePlay=new GamePlay();
		j.add(gamePlay);
		
	}


}
