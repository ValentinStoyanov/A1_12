package main_package;



public class Coordinate {
	
	int value;
	boolean[]  neighbors;
	
	public Coordinate() {

	}

	public String printnei() {
		return  "value:  "+ value +"  Neis: "+ neighbors[0] +" "+neighbors[1]+" "+neighbors[2]+" "+neighbors[3];
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
