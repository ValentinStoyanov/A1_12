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
        
        	 String json =  Reader.readjson("puzzle_10x10.json").toString();

            // Now do the magic.
           Maze maze = new Gson().fromJson(json, Maze.class);

            // Show it.
            System.out.println(maze.getCells());
            
            
    }
}
