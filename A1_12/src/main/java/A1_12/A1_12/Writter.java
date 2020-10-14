package A1_12.A1_12;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class Writter {

	public static String gson_to_json(Maze maze) {
		
		Gson gson = new Gson();
		
		String jsonInString = gson.toJson(maze);
		
		
		return jsonInString;
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
