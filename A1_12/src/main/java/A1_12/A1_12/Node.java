package A1_12.A1_12;

public class Node {
	private int ID;
	private Node parent;
	private Maze state;
	private int cost;
	private String action;
	private int depth;
	private double f;
	double h;
	String estrategia;
	
	public Node() {
		
	}

	public Node(int iD, Node parent, Maze state, int cost, String action, int depth, double f, double h,
			String estrategia) {
		super();
		ID = iD;
		this.parent = parent;
		this.state = state;
		this.cost = cost;
		this.action = action;
		this.depth = depth;
		this.f = f;
		this.h = h;
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
	public Maze getState() {
		return state;
	}
	public void setState(Maze state) {
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

	@Override
	public String toString() {
		return "[ID=" + ID + "] [COST=" + cost + "; ID_STATE=" + state + "; ID_PARENT=" + parent + "; ACTION=" + action
				+ "; DEPTH=" + depth + "; HEURISTIC=" + h + "VALUE=" + f;	
	}
	
}
