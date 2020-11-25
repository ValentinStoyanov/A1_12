package A1_12.A1_12;

import java.io.IOException;

import org.json.simple.parser.ParseException;

public class App 
{
    public static void main( String[] args ) throws IOException, ParseException {
                
        //Problem problema = Reader.importjson1("problema_5x5.json");
        
        Maze maze = Reader.importjson("problema_5x5_maze.json");
        
        //Maze_drawer.draw_maze(maze);
        
      /*  for(int i = 0; i < 5; i++) {
        	for(int j = 0; j < 5; j++) {
        		System.out.println("(" + i + ", " + j + ")");
        		System.out.println(maze.getCells().get("(" + i + ", " + j + ")").printnei());
        	}
        }*/
        
        
        Maze_drawer.draw_maze(maze);
        
    }
}
