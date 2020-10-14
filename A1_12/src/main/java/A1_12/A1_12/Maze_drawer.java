package A1_12.A1_12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Maze_drawer {
	
	
	
	public static void draw_maze(Maze maze) {
		
		
		JFrame frame = new JFrame("GridLayout");
		JPanel p1 =  new JPanel(new GridLayout(maze.getRows(),maze.getCols()));
		
		
		for(int i = 0; i < maze.getRows();i++) {
			for(int j = 0; j< maze.getCols();j++) {
				
				String index = "("+i+", "+j+")";
				
				//System.out.println(index+"   "+maze.getCells().get(index).printnei());
				
				int[] borders =  calculate_coords (maze.getCells(), index);
				
				JPanel p= new JPanel();
				p.setBorder(BorderFactory.createMatteBorder(
						borders[0], borders[3], borders[2], borders[1], Color.BLACK));
						//NORTE, OESTE,SUR,ESTE
				p1.add(p);
				
			}
		}
		
		frame.add(p1, BorderLayout.CENTER);
		
		frame.pack();
		
		frame.setVisible(true);
		saveImage(frame);

	}
	
	
	public static int[] calculate_coords (HashMap<String, Coordinate> cells, String index) {
		
		int[] walls = new int[4];
		
		boolean[] walls_b = cells.get(index).getNeighbors();
		
		if(walls_b[0]!=true) {
			walls[0]=1;
		}
		if(walls_b[1]!=true) {
			walls[1]=1;
		}
		if(walls_b[2]!=true) {
			walls[2]=1;
		}
		if(walls_b[3]!=true) {
			walls[3]=1;
		}
		
		//System.out.println(walls[0]+" "+walls[1]+" "+walls[2]+" "+walls[3]);
		
		return walls;
		
	}
	
	private static void saveImage(JFrame frame){
		 try
	        {
	            BufferedImage image = new BufferedImage(frame.getWidth(), frame.getHeight(), BufferedImage.TYPE_INT_RGB);
	            Graphics2D graphics2D = image.createGraphics();
	            frame.paint(graphics2D);
	            ImageIO.write(image,"jpeg", new File("maze.jpeg"));
	        }
	        catch(Exception exception)
	        {
	            //code
	        }
	}


}
