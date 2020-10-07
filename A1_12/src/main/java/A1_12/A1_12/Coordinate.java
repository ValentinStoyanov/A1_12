package A1_12.A1_12;

import java.util.ArrayList;

public class Coordinate {
	

	int x;
	int y;
	int value;
	ArrayList<Boolean> neighbours;
	
	
	public Coordinate(int x, int y, int value, ArrayList<Boolean> neighbours) {
		super();
		this.x = x;
		this.y = y;
		this.value = value;
		this.neighbours = neighbours;
	}
	
	public Coordinate() {
		
	}


	@Override
	public String toString() {
		return "Coordinate [x=" + x + ", y=" + y + ", value=" + value + ", neighbours=" + neighbours + "]";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public ArrayList<Boolean> getNeighbours() {
		return neighbours;
	}

	public void setNeighbours(ArrayList<Boolean> neighbours) {
		this.neighbours = neighbours;
	}
	
	

}
