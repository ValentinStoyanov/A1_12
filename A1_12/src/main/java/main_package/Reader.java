package main_package;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;
 

public class Reader {
	
	
	
	
	public static Problem importjson1(String file) throws IOException, ParseException {
		
		
		JSONParser parser = new JSONParser();
	
			Object obj = parser.parse(new FileReader(file));
 
			// A JSON object. Key value pairs are unordered. JSONObject supports java.util.Map interface.
			JSONObject jsonObject = (JSONObject) obj;
 
			
			String initial = (String) jsonObject.get("INITIAL");
			
			String [] parts = initial.split(",");
			String i1 = parts[0].replace("(", "");
			String i2 = parts[1].replace(")", "");
			
			int[] init_array = new int[2];
			
			
			init_array[0] = Integer.parseInt(i1);
			init_array[1] = Integer.parseInt(i2.substring(1));
			
			
			String objective = (String) jsonObject.get("OBJETIVE");
			
			parts = objective.split(",");
			i1 = parts[0].replace("(", "");
			i2 = parts[1].replace(")", "");
					
			int[] obj_array = new int[2];
			
			obj_array[0] = Integer.parseInt(i1);
			obj_array[1] = Integer.parseInt(i2.substring(1));
			
			
			String maze_file = (String) jsonObject.get("MAZE");
			
			/*System.out.println(init_array[0]+" "+init_array[1]);
			System.out.println(obj_array[0]+" "+obj_array[1]);
			System.out.println(maze_file);*/
			

		
       Maze maze =importjson(maze_file);
		
       Problem p = new Problem(init_array,obj_array,maze);
       
       return p;
       
		
	}
	
    
    public static Maze importjson(String file) {
		// Method that reads a json file

		// Parser
		JSONParser jsonParser = new JSONParser();
		Object obj = null;

		try (FileReader reader = new FileReader(file)) { // Name of the json file with the maze
			// Read JSON file
			obj = jsonParser.parse(reader);

			//System.out.println(obj.toString()+"/n/n/n/n");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Maze maze = new Gson().fromJson(obj.toString(), Maze.class);
		
		return maze;
		
	}
		
}
