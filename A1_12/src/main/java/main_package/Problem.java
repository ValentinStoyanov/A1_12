package main_package;

public class Problem {
	

	int[] inital;
	int[] objective;
	Maze maze;

	
	public Problem(int[] inital, int[] objective, Maze maze) {
		super();
		this.inital = inital;
		this.objective = objective;
		this.maze = maze;
	}


	public int[] getInital() {
		return inital;
	}


	public void setInital(int[] inital) {
		this.inital = inital;
	}


	public int[] getObjective() {
		return objective;
	}


	public void setObjective(int[] objective) {
		this.objective = objective;
	}


	public Maze getMaze() {
		return maze;
	}


	public void setMaze(Maze maze) {
		this.maze = maze;
	}
	
}
