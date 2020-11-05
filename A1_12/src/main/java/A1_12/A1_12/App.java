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
        
        Maze maze = Reader.importjson("sucesores_10x10_maze.json");
        
        
        System.out.println(
        
        Maze_operator.get_succesors(0, 6, maze.getCells())
        
        );
        
        //Maze_drawer.draw_maze(maze);
        
        
        
        //Writter.w_file(maze, "prueba.json");
 
    }
}
