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


	@Override
	public String toString() {
		return "Coordinate [x=" + x + ", y=" + y + ", value=" + value + ", neighbours=" + neighbours + "]";
	}
	
	

}
