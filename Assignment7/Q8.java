package Assignment7;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Graph1<T>{
	private Map<T, List<T>> map = new HashMap<>();
	public void addnewVertex(T s) {
		map.put(s, new LinkedList<T>());
	}
	public void addnewEdge(T source,T destination,boolean bidirectional) {
		if(!map.containsKey(source)) {
			addnewVertex(source);
		}
		if(!map.containsKey(destination)) {
			addnewVertex(destination);
		}
		map.get(source).add(destination);
		if(bidirectional==true) {
			map.get(destination).add(source);
		}
	}
	public void countVertices() {
		System.out.println("Total number of vertices "+ map.keySet().size());
	}
	public void countEdges(boolean bidirectional) {
		int count =0;
		for(T v:map.keySet()) {
			count = count+map.get(v).size();
		}
		if(bidirectional==true) {
			count = count/2;
		}
		System.out.println("the total no. of edges "+ count);
	}
	public void containsVertex(T s) {
		if(map.containsKey(s)) {
			System.out.println("the graph contains "+s+" as a vertex");
		}
		else {
			System.out.println("The graph doesnt contain "+ s);
		}
	}
	public  void containsEdge(T s, T d) {
		if(map.get(s).contains(d)){
			System.out.println("The graph contains an edge between "+s +" and "+d);
		}
		else {
			System.out.println("There is no edge between "+s+" and "+d);
		
	    }
	}
	@Override
	public String toString() {
		StringBuilder graphBuilder =new StringBuilder();
		for(T v:map.keySet()) {
			graphBuilder.append(v.toString()+": ");
			for(T w:map.get(v)) {
				graphBuilder.append(w.toString()+"  ");
			}
			graphBuilder.append("\n");
		}
		return (graphBuilder.toString());
	}
	
	 public void BFS(int startVertex) {
	        boolean[] visited = new boolean[vertices];
	        Queue<Integer> queue = new ArrayDeque<>();

	        visited[startVertex] = true;
	        queue.offer(startVertex);

	        System.out.print("BFS traversal starting from vertex " + startVertex + ": ");

	        while (!queue.isEmpty()) {
	            int currentVertex = queue.poll();
	            System.out.print(currentVertex + " ");

	            for (int neighbor : adjList.get(currentVertex)) {
	                if (!visited[neighbor]) {
	                    visited[neighbor] = true;
	                    queue.offer(neighbor);
	                }
	            }
	        }
	        System.out.println();
	    }
	
}
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
