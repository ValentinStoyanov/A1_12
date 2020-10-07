package A1_12.A1_12;

import java.util.ArrayList;

public class Maze {
	
	int rows;
	int cols;
	int max_n;
	ArrayList<int[]> mov;
	ArrayList<String> id_mov;
	Object cells;
	
	public Maze() {

	}

	@Override
	public String toString() {
		return "Maze [rows=" + rows + ", cols=" + cols + ", max_n=" + max_n + ", mov=" + mov + ", id_mov=" + id_mov
				+ ", cells=" + cells + "]";
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getCols() {
		return cols;
	}

	public void setCols(int cols) {
		this.cols = cols;
	}

	public int getMax_n() {
		return max_n;
	}

	public void setMax_n(int max_n) {
		this.max_n = max_n;
	}

	public ArrayList<int[]> getMov() {
		return mov;
	}

	public void setMov(ArrayList<int[]> mov) {
		this.mov = mov;
	}

	public ArrayList<String> getId_mov() {
		return id_mov;
	}

	public void setId_mov(ArrayList<String> id_mov) {
		this.id_mov = id_mov;
	}

	public Object getCells() {
		System.out.println("tamaño cells ");
		return cells;
	}



	

}
