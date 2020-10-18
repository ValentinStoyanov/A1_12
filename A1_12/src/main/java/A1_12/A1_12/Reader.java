package A1_12.A1_12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;
 

public class Reader {
	
    
    public static Maze importjson(String file) {
		// Method that reads a json file

		// Parser
		JSONParser jsonParser = new JSONParser();
		Object obj = null;

		try (FileReader reader = new FileReader(file)) { // Name of the json file with the cube
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
