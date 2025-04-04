package DataStructures;
import java.lang.foreign.VaList.Builder;
import java.util.*;

//import org.jcp.xml.dsig.internal.MacOutputStream;
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
	
}

public class Graphs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph1 graph = new Graph1();
		graph.addnewEdge(0, 1, true);
		graph.addnewEdge(0, 4, true);
		graph.addnewEdge(1, 2, true);
		graph.addnewEdge(1, 3, false);
		graph.addnewEdge(1, 4, true);
		graph.addnewEdge(2, 3, true);
		graph.addnewEdge(2, 4, true);
		graph.addnewEdge(3, 0, true);
		graph.addnewEdge(2, 0, true);
		System.out.println("Adjencency list for the graph is "+ graph.toString());
		graph.countVertices();
		graph.countEdges(true);
		graph.containsEdge(3, 4);
		graph.containsEdge(2, 4);
		graph.containsVertex(3);
		graph.containsVertex(5);
		

	}

}

//output
//Adjencency list for the graph is 0: 1  4  3  2  
//1: 0  2  3  4  
//2: 1  3  4  0  
//3: 2  0  
//4: 0  1  2  
//
//Total number of vertices 5
//the total no. of edges 8
//There is no edge between 3 and 4
//The graph contains an edge between 2 and 4
//the graph contains 3 as a vertex
//The graph doesnt contain 5
//
