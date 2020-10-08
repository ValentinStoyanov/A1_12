package A1_12.A1_12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Maze {
	
	int rows;
	int cols;
	int max_n;
	ArrayList<int[]> mov;
	ArrayList<String> id_mov;
	HashMap<String, Coordinate> cells;
	
	public Maze() {

	}

	public HashMap<String, Coordinate> getCells() {
		return cells;
	}

	public void setCells(HashMap<String, Coordinate> cells) {
		this.cells = cells;
	}

	@Override
	public String toString() {
		return "Maze [rows=" + rows + ", cols=" + cols + ", max_n=" + max_n + ", mov=" + mov + ", id_mov=" + id_mov
				+ ", cells=" + cells + "]";
	}





	

}
