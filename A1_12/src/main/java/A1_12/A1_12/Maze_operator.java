package A1_12.A1_12;

import java.util.HashMap;

public class Maze_operator {

	public static String get_succesors(int i, int j, HashMap<String, Coordinate> cells) {

		String index = "(" + i + ", " + j + ")";

		String succ = "SUC" + index + "=[";

		Coordinate coor = cells.get(index);

		System.out.println(coor.getNeighbors()[0] + " " + coor.getNeighbors()[1] + " " + coor.getNeighbors()[2] + " "
				+ coor.getNeighbors()[3]);

		int x1;

		if (coor.getNeighbors()[0] != false) {
			// N i--
			x1 = i - 1;
			succ = succ + get_succesor_single(x1, j, cells, "N");
		}

		if (coor.getNeighbors()[1] != false) {
			// E j++
			x1 = j + 1;
			succ = succ + get_succesor_single(i, x1, cells, "E");
		}

		if (coor.getNeighbors()[2] != false) {
			// S i++
			x1 = i + 1;
			succ = succ + get_succesor_single(x1, j, cells, "S");
		}

		if (coor.getNeighbors()[3] != false) {
			// O j--
			x1 = j - 1;
			succ = succ + get_succesor_single(i, x1, cells, "O");
		}

		return succ.substring(0, succ.length() - 1) + "]";

	}

	public static String get_succesor_single(int i, int j, HashMap<String, Coordinate> cells, String n) {

		Coordinate succ = cells.get("(" + i + ", " + j + ")");

		int coste = 1;

		return "(" + n + ", " + "(" + i + " ," + j + "), " + coste + "),";

	}

}
