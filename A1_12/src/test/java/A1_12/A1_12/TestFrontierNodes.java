package A1_12.A1_12;

import java.util.PriorityQueue;

import org.junit.Test;

public class TestFrontierNodes {

	@Test
	public void testFile1() {
		int numberNodes =0;
		try {
			Maze maze = Reader.importjson("sucesores_10x10_maze.json");
			PriorityQueue<Node> pq = new PriorityQueue<Node>();

			while (true) {
				Node node = new Node((int) Math.random() * 10000, null, maze, (int) Math.random() * 3, "S",
						(int) Math.random() * 6, 2.2, 2.2, "A*");
				pq.offer(node);
				++numberNodes;
			}
		} catch (OutOfMemoryError e) {
			System.out.println("Test ended. Number of nodes: "+numberNodes);
		}
	}

}