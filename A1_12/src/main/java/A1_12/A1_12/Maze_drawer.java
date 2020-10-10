package A1_12.A1_12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Maze_drawer {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("GridLayout");
		
		JPanel p1 =  new JPanel(new GridLayout(15,20));
		
		
		for(int i = 0; i< 300;i++) {
			JPanel p= new JPanel();
			p.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.BLACK));
			p1.add(p);
		}
		
		
		
		frame.add(p1, BorderLayout.CENTER);
		
		frame.pack();
		
		frame.setVisible(true);

		
	}

}
