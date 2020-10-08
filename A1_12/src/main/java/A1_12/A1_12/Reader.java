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
    
 /*   public static void convertjson(String file) {
    	JSONObject obj = (JSONObject) readjson(file);
    	Long rows = (Long) obj.get("rows");
    	Long cols = (Long) obj.get("cols");
    	Long max_n = (Long) obj.get("max_n");
    	JSONArray mov = (JSONArray) obj.get("mov");
    	JSONArray id_mov = (JSONArray) obj.get("id_mov");
    	JSONObject cells = (JSONObject) obj.get("cells");
    
    	
    	Maze maze = new Maze(rows.intValue(),cols.intValue(),max_n.intValue(),
    			mov_to_array(mov),id_mov_to_array(id_mov));
    	
    	
    	
    	
    	
    	for(int i = 0; i < rows;i++) {
    		for(int j = 0; j < cols; j++) {
    			
    			maze.getCells().add(convertcell (i,j,cells));
    			
    		}
    	}	
    	
    	
    }
    
    public static Coordinate convertcell (int i, int j, JSONObject cells) {
    	
    	JSONObject coordenada = (JSONObject) cells.get("("+i+","+j+")");
    	
    	JSONArray neighbors = (JSONArray) coordenada.get("neighbors");
    	
    	Long value = (Long) coordenada.get("value");	
    	
    	ArrayList<Boolean> b_list = new ArrayList<Boolean>();
    	
    	for (int t = 0; t < neighbors.size();t ++) {
    		b_list.add((Boolean) neighbors.get(t));
    	}
    	
    	Coordinate coor = new Coordinate(i,j,value.intValue(),b_list);
    	
    	return coor;
    	
    	
    	
    }
    
    public static ArrayList<int[]> mov_to_array (JSONArray mov) {
    	
    	ArrayList<int[]> mov_array = new ArrayList<int[]>();
    	
    	for(int i = 0; i < mov.size();i++) {
    		JSONArray a = (JSONArray) mov.get(i);
    		Long i1 = (Long) a.get(0);
    		Long i2 = (Long) a.get(1);
    		int [] aux = new int[2];
    		aux[0] = i1.intValue();
    		aux[1] = i2.intValue();
    		mov_array.add(aux);
    	}
    	
    	return mov_array;
    	
    }
    
    public static ArrayList<String> id_mov_to_array (JSONArray id_mov) {
    	
    	ArrayList<String> id_mov_array = new ArrayList<String>();
    	
    	for(int i = 0; i < id_mov.size();i++) {
    		String a = (String) id_mov.get(i);
    		id_mov_array.add(a);
    	}
    	
    	return id_mov_array;
    	
    	
    }*/
		
}
