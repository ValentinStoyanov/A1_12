package A1_12.A1_12;

import java.util.PriorityQueue;


public class Frontier {


	
	public static void testpriorityqueue() {
		
		long startTime = System.nanoTime();
		
		Maze maze=Reader.importjson("sucesores_10x10_maze.json");
		PriorityQueue<Node> pq =  new PriorityQueue<Node>();
		
		for (int i = 0; i < 10000000;i++) {
		
		Node node= new Node((int)Math.random()*10000, null, maze,  (int)Math.random()*3, "S",  (int)Math.random()*6,  2.2,  2.2,"A*");
		pq.offer(node);
		}
		
		long endTime = System.nanoTime();
		
		long duration = ((endTime - startTime)/1000000);
		
		System.out.println(duration);
		
		
	}

}
