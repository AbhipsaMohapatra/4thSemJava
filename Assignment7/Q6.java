package Assignment7;
import java.util.*;

public class Q6 {
	private int V;
	private List<List<Integer>> adjList;
	private int[][] adjMatrix;
	public Q6(int V) {
		this.V = V;
		adjList = new ArrayList<>(V);
		adjMatrix = new int[V][V];
		for(int i=0;i<V;i++) {
			adjList.add(new LinkedList<Integer>());
			
		}
	}
	public void addEdge(int src,int dest) {
		//Add edge to adjancency list
		adjList.get(src).add(dest);
		//Add edge to adjacency matrix
		adjMatrix[src][dest] = 1;
	}
	public void displayAdjMatrix() {
		System.out.println("Adjacency matrix");
		for(int i=0;i<V;i++) {
			for(int j=0;j<V;j++) {
				System.out.print(adjMatrix[i][j]+" ");
				
			}
			System.out.println();
		}
	}
	public void displayAdjList() {
		System.out.println("Adjacency list :");
		for(int i=0;i<V;i++) {
			System.out.print(i+" -> ");
			for(Integer neighbor:adjList.get(i)) {
				System.out.print(neighbor+" ");
				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int V=5;
		Q6 graph = new Q6(V);
		graph.addEdge(0, 1);
		graph.addEdge(0, 4);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		graph.displayAdjMatrix();
		System.out.println();
		graph.displayAdjList();
		

	}

}
