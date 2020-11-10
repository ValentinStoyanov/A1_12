package A1_12.A1_12;

import java.util.LinkedList;
import java.util.PriorityQueue;


public class Frontier {

	/*public static void main(String[] args) {
				
		double queuetime = 0;
		queuetime += testpriorityqueue();
		queuetime += testpriorityqueue();
		queuetime += testpriorityqueue();
		queuetime += testpriorityqueue();
		queuetime += testpriorityqueue();
		queuetime += testpriorityqueue();
		
		System.out.println("El tiempo medio de la queue para la insercion de nodos es:  "+(queuetime/6)/1000000000);
	}*/
	
	public static PriorityQueue<Node> addpriorityqueue() {
		
		Maze maze=Reader.importjson("sucesores_10x10_maze.json");
		PriorityQueue<Node> pq =  new PriorityQueue<Node>();
		Node node= new Node((int)Math.random()*10000, null, maze,  (int)Math.random()*3, "S",  (int)Math.random()*6,  2.2,  2.2,"A*");
		pq.add(node);
		return pq;
		
	}
	public static PriorityQueue<Node> pullpriorityqueue() {
		
		
		Maze maze=Reader.importjson("sucesores_10x10_maze.json");
		PriorityQueue<Node> pq =  addpriorityqueue();//ejecuta este varias veces para que puedas quitar o sacar los que puedas
		Node node=new Node();
		node=pq.poll();
		return pq;
		
	}
}
