package Assignment7;
import java.util.*;
class Graph<T>{
	private LinkedList<T>[] adjList;
	private int vertices;
	Graph(int vertices){
		this.vertices = vertices;
		adjList = new LinkedList[vertices];
		for(int i=0;i<vertices;i++) {
			adjList[i]=new LinkedList<>(); 
		}
	}
	void addEdge(int src,T des) {
		if(src>=0 && src<vertices) {
			adjList[src].add(des);
		}
		else {
			throw new IndexOutOfBoundsException("Vertex "+src+" does not exist ");
		}
	}
	void printAdjList() {
		for(int i=0;i<vertices;i++) {
			System.out.println("Vertices "+i+ " ->");
			for(T vertex : adjList[i]) {
				System.out.println(vertex+" ");
			}
			System.out.println();
		}
	}
	void DFS(int vertex,boolean[] visited) {
		
	}
	
}

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
