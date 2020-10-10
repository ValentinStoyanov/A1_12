package A1_12.A1_12;

import java.util.ArrayList;

public class Coordinate {
	
	int value;
	boolean[]  neighbors;
	
	
	public Coordinate() {

	}

	public String printnei() {
		
		return neighbors[0] +" "+neighbors[1]+" "+neighbors[2]+" "+neighbors[3];
	}
	
	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	public boolean[] getNeighbors() {
		return neighbors;
	}


	public void setNeighbors(boolean[] neighbors) {
		this.neighbors = neighbors;
	}




	
	
	

}
