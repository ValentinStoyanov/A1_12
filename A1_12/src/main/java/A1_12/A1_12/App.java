package A1_12.A1_12;

import java.io.IOException;

import org.json.simple.parser.ParseException;

public class App 
{
    public static void main( String[] args ) throws IOException, ParseException {
                
        Problem problema = Reader.importjson1("problema_25x25.json");
        
        Maze_resolver.busqueda ( problema, 10000 , "BREADTH" );
        
     
        
     
        
        
        
        
    }
}
