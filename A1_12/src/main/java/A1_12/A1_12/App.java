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
        System.out.println("-----------"+ " App starting "+"----------" +"\n\n");
        
        Maze maze = Reader.importjson("puzzle_10x20.json");
        
        Maze_drawer.draw_maze(maze);
        
        
        
        Writter.w_file(maze, "prueba.json");
 
    }
}
