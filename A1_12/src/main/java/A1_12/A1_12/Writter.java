package A1_12.A1_12;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class Writter {

	public static String gson_to_json(Maze maze) {
		
		Gson g = new Gson();
		
		String jsonInString = g.toJson(maze);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		JsonParser jp = new JsonParser();
		JsonElement je = jp.parse(jsonInString);
		String prettyJsonString = gson.toJson(je);
		
		return prettyJsonString;
	}
	
	
	public static void w_file(Maze maze, String file_name) {
		 try {
		      FileWriter myWriter = new FileWriter(file_name);
		      myWriter.write(gson_to_json(maze));
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	
}
