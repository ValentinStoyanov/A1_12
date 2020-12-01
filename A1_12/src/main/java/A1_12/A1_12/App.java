package A1_12.A1_12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.parser.ParseException;

public class App {
	public static void main(String[] args) throws IOException, ParseException {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el nombre del archivo con el Problema");

		String json_name = teclado.next();

		File tempFile = new File(json_name);
		boolean exists = tempFile.exists();

		while (!exists) {
			System.out.println("El archivo no existe, vuelva a introducir el nombre del archivo");
			json_name = teclado.next();
			tempFile = new File(json_name);
			exists = tempFile.exists();
			;

		}

		System.out.println("Introduce la estrategia deseada" + "\n"
				+ "Estrategias disponibles: [A] [BREADTH] [DEPTH] [GREEDY] [UNIFORM]");

		String estrategia = teclado.next();

		while (exists) {

			switch (estrategia) {
			case "A":
				exists = false;
				break;
			case "BREADTH":
				exists = false;
				break;
			case "DEPTH":
				exists = false;
				break;
			case "GREEDY":
				exists = false;
				break;
			case "UNIFORM":
				exists = false;
				break;

			default:
				System.out.println("Estrategia incorrecta, vuelva a introducirla");
				estrategia = teclado.next();

			}

		}
		
		
		System.out.println("Desea dibujar el laberinto SI(s) o NO(n)");
		
		String dibujar = teclado.next();

		teclado.close();
		
		

		Problem problema = Reader.importjson1(json_name);

		if(dibujar.equals("s")) {
			Maze_drawer.draw_maze(problema.getMaze());
		}
		
		Maze_resolver.busqueda ( problema, 1000000 , estrategia );


	}
}
