package A1_12.A1_12;

import java.util.ArrayList;

public class Maze {
	
	int rows;
	int cols;
	int max_n;
	ArrayList<int[]> mov;
	ArrayList<String> id_mov;
	ArrayList<Coordinate> cells = new ArrayList<Coordinate>();
	
	public Maze(int rows, int cols, int max_n, ArrayList<int[]> mov, ArrayList<String> id_mov) {
		super();
		this.rows = rows;
		this.cols = cols;
		this.max_n = max_n;
		this.mov = mov;
		this.id_mov = id_mov;
	}

	public ArrayList<Coordinate> getCells() {
		return cells;
	}

	public void setCells(ArrayList<Coordinate> cells) {
		this.cells = cells;
	}

	@Override
	public String toString() {
		return "Maze [rows=" + rows + ", cols=" + cols + ", max_n=" + max_n + ", mov=" + mov + ", id_mov=" + id_mov
				+ ", cells=" + cells + "]";
	}

	

}
