package A1_12.A1_12;

import java.io.FileNotFoundException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException
    {
        System.out.println( "App starting" );
        
        Reader.convertjson("Maze4x4.json");
    }
}
