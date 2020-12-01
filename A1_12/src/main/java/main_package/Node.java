package main_package;


public class Node implements Comparable<Node> {

	private int ID;
	private Node parent;
	private int row;
	private int col;
	private Coordinate state;
	private int cost;
	private String action;
	private int depth;
	private double f;
	double h;
	String estrategia;

	public Node() {

	}

	public Node(int iD, Node parent, int row, int col, Coordinate state, int cost, String action, int depth,
			 String estrategia) {
		super();
		ID = iD;
		this.parent = parent;
		this.row = row;
		this.col = col;
		this.state = state;
		this.cost = cost;
		this.action = action;
		this.depth = depth;

		this.estrategia = estrategia;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public Coordinate getState() {
		return state;
	}

	public void setState(Coordinate state) {
		this.state = state;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public double getF() {
		return f;
	}

	public void setF(double f) {
		this.f = f;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public String getEstrategia() {
		return estrategia;
	}

	public void setEstrategia(String estrategia) {
		this.estrategia = estrategia;
	}

	public int compareTo(Node node) {

		if (node.getF() < this.getF()) {
			return 1;
		} else if (node.getF() > this.getF()) {
			return -1;
		} else if (node.getRow() < this.getRow()) {
			return 1;
		} else if (node.getRow() > this.getRow()) {
			return -1;
		} else if (node.getCol() < this.getCol()) {
			return 1;
		} else if (node.getCol() > this.getCol()) {
			return -1;
		} else if (node.getID() < this.getID()) {
			return 1;
		} else {
			return -1;
		}

	}

}
