package A1_12.A1_12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Maze_resolver {
	
	
	public static void busqueda (Problem problema, int profundidad, String estrategia) throws IOException {
		
		PriorityQueue<Node> frontera =  new PriorityQueue<Node>();
		ArrayList<Node> visitados = new ArrayList();
		
		int[] inicial = problema.getInital();
		
		Node n_final = new Node();
		
		Coordinate coor_ini = problema.getMaze().getCells().get("(" + inicial[0] + ", " + inicial[1] + ")");
		
		
		Node n_inicial = new Node(0,null,inicial[0],inicial[1],coor_ini,0,"",0,estrategia);

		n_inicial.setH(calcular_h (problema, n_inicial ));
		
		n_inicial.setF(calcular_f (estrategia, n_inicial));
		
		int node_id = 0;
		
		//Insertar nodo inicial 
		frontera.offer(n_inicial);
		
		boolean solucion = false;
		
		while(!frontera.isEmpty()  && !solucion) {
			
			Node nodo = frontera.poll();
			
			if(isGoal(problema, nodo)) {
				solucion = true;
				n_final = nodo;
				
				
				
			}else if(!isVisited( visitados, nodo) && nodo.getDepth()<profundidad){
			
				
				
				visitados.add(nodo);
				
				ArrayList<Node> nodos_hijos =expandir_nodo (problema, nodo,estrategia);
				
				for(Node n :nodos_hijos) {
					node_id++;
					n.setID(node_id);
					frontera.offer(n);
				}
				
				
			}
		}
		
		
		if(solucion == true) {
			
			System.out.println("Solucion encontrada");
			
			BufferedWriter writer = new BufferedWriter(new FileWriter("solucion.txt", false));
			
		    writer.append("[id][cost,state,father_id,action,depth,h,value]"+"\n"+"["+n_inicial.getID()+"]"+"["+n_inicial.getCost()+",("+n_inicial.getRow()+","+n_inicial.getCol()+"),"+0+","+n_inicial.getAction()+","+n_inicial.getDepth()+","+n_inicial.getH()+","+n_inicial.getF()+"]"+"\n");
		    			
			return_parent (n_final,writer);
		    
		    writer.close();
			
			
			
		}else {
			System.out.println("Solucion no existe");
		}

		
	}
	
	public static void return_parent (Node nodo,BufferedWriter writer) throws IOException {
		
		if(nodo.getParent()!=null) {
			 return_parent (nodo.getParent(),writer);
			 
			 //[id][cost,state,father_id,action,depth,h,value]
			 
			 writer.append("["+nodo.getID()+"]"+"["+nodo.getCost()+",("+nodo.getRow()+","+nodo.getCol()+"),"+nodo.getParent().getID()+","+nodo.getAction()+","+nodo.getDepth()+","+nodo.getH()+","+nodo.getF()+"]"+"\n");
		
			 
		}
		
	}
	
	
	public static boolean isVisited (ArrayList<Node> visitados, Node nodo) {
		boolean visited = false;
		
		for (int i = 0; i < visitados.size();i++) {
			if(visitados.get(i).getRow()==nodo.getRow()  &&  visitados.get(i).getCol()==nodo.getCol()) {
				//if(visitados.get(i).getCost()<nodo.getCost()) {
					visited = true;
				//}
				
			}
		}
		
		return visited;
		
	}
	
	
	public static ArrayList<Node> expandir_nodo (Problem problema, Node nodo, String estrategia){
		ArrayList<Node> nodos_hijos =  get_succesors ( problema, nodo,estrategia);
		 
		for (int i = 0; i < nodos_hijos.size();i++) {
			
			nodos_hijos.get(i).setH(calcular_h (problema, nodos_hijos.get(i)));
			nodos_hijos.get(i).setF(calcular_f (estrategia, nodos_hijos.get(i)));
			
			/*
			System.out.println(nodos_hijos.get(i).getRow()+
			" "+nodos_hijos.get(i).getCol()
			+" "+nodos_hijos.get(i).getCost()
			+" "+nodos_hijos.get(i).getH()
			+" "+nodos_hijos.get(i).getF()
			+" "+nodos_hijos.get(i).getDepth());
			*/
			
		}
		
		return nodos_hijos;
	}
	
	public static ArrayList<Node> get_succesors (Problem problema, Node nodo,String estrategia) {
		
		ArrayList<Node> succ = new ArrayList<Node>();
		
		
		int x1;
		
		
		
		// Norte
		if(nodo.getState().getNeighbors()[0]!=false) {
			
			//System.out.println("NORTE");
			
			x1 = nodo.getRow() -1;
			
			Coordinate state = problema.getMaze().getCells().get("(" + x1 + ", " + nodo.getCol() + ")");
			
			Node norte = new Node(0,
					nodo,
					x1,
					nodo.getCol(),
					state,
					(state.getValue()+ nodo.getCost()+1),
					"N",
					(nodo.getDepth()+1),
					estrategia);
			
			
			
			succ.add(norte);
			
		
		}
		
		//Este
		if(nodo.getState().getNeighbors()[1]!=false) {
			
			//System.out.println("ESTE");
			
			x1 = nodo.getCol()+1;
			
			Coordinate state = problema.getMaze().getCells().get("(" + nodo.getRow() + ", " + x1 + ")");
			
			Node norte = new Node(0,
					nodo,
					nodo.getRow(),
					x1,
					state,
					(state.getValue()+ nodo.getCost()+1),
					"E",
					(nodo.getDepth()+1),
					estrategia);
			
			succ.add(norte);
		}
		//Sur
		if(nodo.getState().getNeighbors()[2]!=false) {
			
			//System.out.println("SUR");
			
			x1 = nodo.getRow() +1;
			
			Coordinate state = problema.getMaze().getCells().get("(" + x1 + ", " + nodo.getCol() + ")");
			
			Node norte = new Node(0,
					nodo,
					x1,
					nodo.getCol(),
					state,
					(state.getValue()+ nodo.getCost()+1),
					"S",
					(nodo.getDepth()+1),
					estrategia);
			
			succ.add(norte);
		}
		//Oeste
		if(nodo.getState().getNeighbors()[3]!=false) {
			
			//System.out.println("OESTE");
			
			x1 = nodo.getCol()-1;
			
			Coordinate state = problema.getMaze().getCells().get("(" + nodo.getRow() + ", " + x1 + ")");
			
			Node norte = new Node(0,
					nodo,
					nodo.getRow(),
					x1,
					state,
					(state.getValue()+ nodo.getCost()+1),
					"O",
					(nodo.getDepth()+1),
					estrategia);
			
			succ.add(norte);
		}
		
		return succ;
		
	}
	
	
	
	public static double  calcular_f (String estrategia, Node nodo) {
		
		double f_value = 0.0;
		
		switch (estrategia) {
		
		case "BREADTH":
			f_value = nodo.getDepth();
			break;
		case "DEPTH":
			f_value = 1.0/(nodo.getDepth()+1.0);
			break;
		case "UNIFORM":
			f_value = nodo.getCost();
			break;
		case "GREEDY":
			f_value = nodo.getH();
			break;
		case "A":
			f_value = nodo.getH() + nodo.getCost();
			break;
		
		
		}
		
		
		
		return f_value;
	}
	
	
	public static double calcular_h (Problem problem, Node actual ) {
		
		double h =  Math.abs(actual.getRow() - problem.getObjective()[0]) + Math.abs(actual.getCol() - problem.getObjective()[1]); 
		
		
		return h;
	}
	
	
	public static boolean isGoal(Problem p, Node actual) {
		if(p.getObjective()[0]==actual.getRow() && p.getObjective()[1]==actual.getCol()) {
			return true;
		}else {
			return false;
		}
		
	
	}
	
	

}
