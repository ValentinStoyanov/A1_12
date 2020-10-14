package A1_12.A1_12;

import java.io.FileNotFoundException;
import java.util.Collection;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException
    {
        System.out.println("-----------"+ " App starting "+"----------" +"\n\n");
        
        Maze maze = Reader.importjson("prueba.json");
        
        Maze_drawer.draw_maze(maze);
        
        Writter.w_file(maze, "prueba.json");
        
        
    		
        
        
       
        
    }
}
