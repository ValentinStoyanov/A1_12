package main_package;

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
    JPanel p1 = new JPanel(new GridLayout(maze.getRows(), maze.getCols()));

    for (int i = 0; i < maze.getRows(); i++) {
      for (int j = 0; j < maze.getCols(); j++) {

        String index = "(" + i + ", " + j + ")";
        
        //System.out.println("(" + i + ", " + j + ")");
		//System.out.println(maze.getCells().get("(" + i + ", " + j + ")").printnei());

        check_incosistency(i, j, maze.getCells());

        int[] borders = calculate_coords(maze.getCells(), index);

        JPanel p = new JPanel();
        p.setBorder(
            BorderFactory.createMatteBorder(borders[0], borders[3], borders[2], borders[1], Color.BLACK));
        // NORTE, OESTE,SUR,ESTE
        p1.add(p);
        //N,E,S,O
        //0,1,2,3
      }
    }

    frame.add(p1, BorderLayout.CENTER);

    frame.pack();

    frame.setVisible(true);
    
    saveImage(frame);

  }
  
  
  public static void saveImage(JFrame frame){
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
  

  public static int[] calculate_coords(HashMap<String, Coordinate> cells, String index) {

    int[] walls = new int[4];

    boolean[] walls_b = cells.get(index).getNeighbors();

    if (walls_b[0] != true) {
      walls[0] = 1;
    }
    if (walls_b[1] != true) {
      walls[1] = 1;
    }
    if (walls_b[2] != true) {
      walls[2] = 1;
    }
    if (walls_b[3] != true) {
      walls[3] = 1;
    }

    //System.out.println("Borders: "+walls[0]+" "+walls[1]+" "+walls[2]+" "+walls[3]);

    return walls;

  }

  public static void check_incosistency(int i, int j, HashMap<String, Coordinate> cells) {

    check_incosistency_aux(cells, i, j, "N");
    check_incosistency_aux(cells, i, j, "S");
    check_incosistency_aux(cells, i, j, "E");
    check_incosistency_aux(cells, i, j, "O");

  }

  public static boolean check_incosistency_aux(HashMap<String, Coordinate> cells, int i, int j, String s) {

    boolean bool = true;

    String index = "(" + i + ", " + j + ")";

    Coordinate cor_to_check = cells.get(index);
    Coordinate c_aux;

    switch (s) {

    case "N":

      --i;

      if (cells.get(("(" + i + ", " + j + ")")) != null) {

        c_aux = cells.get(("(" + i + ", " + j + ")"));

        if (cor_to_check.getNeighbors()[0] != c_aux.getNeighbors()[2]) {
          bool = false;

          System.out.println(
              "There is an incosistency between nodes" + index + " , " + "(" + i + ", " + j + ")");
        }
      }
      break;

    case "S":

      ++i;

      if (cells.get(("(" + i + ", " + j + ")")) != null) {

        c_aux = cells.get(("(" + i + ", " + j + ")"));

        if (cor_to_check.getNeighbors()[2] != c_aux.getNeighbors()[0]) {
          bool = false;
          System.out.println(
              "There is an incosistency between nodes" + index + " , " + "(" + i + ", " + j + ")");
        }
      }

      break;

    case "E":

      ++j;

      if (cells.get(("(" + i + ", " + j + ")")) != null) {

        c_aux = cells.get(("(" + i + ", " + j + ")"));

        if (cor_to_check.getNeighbors()[1] != c_aux.getNeighbors()[3]) {
          bool = false;
          System.out.println(
              "There is an incosistency between nodes" + index + " , " + "(" + i + ", " + j + ")");
        }
      }

      break;

    case "O":

      --j;

      if (cells.get(("(" + i + ", " + j + ")")) != null) {

        c_aux = cells.get(("(" + i + ", " + j + ")"));

        if (cor_to_check.getNeighbors()[3] != c_aux.getNeighbors()[1]) {
          bool = false;
          System.out.println(
              "There is an incosistency between nodes" + index + " , " + "(" + i + ", " + j + ")");
        }
      }
      break;

    }

    return bool;

  }

}