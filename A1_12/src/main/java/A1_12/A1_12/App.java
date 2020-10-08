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
        System.out.println( "App starting" );
        
        Maze maze = Reader.importjson("puzzle_10x10.json");
            
           System.out.println(maze.toString());
    }
}
