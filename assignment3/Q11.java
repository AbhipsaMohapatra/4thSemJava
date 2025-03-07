package assignment3;

import java.util.PriorityQueue;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,10,8,7,3,4,6,5,9};
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		for(int num:arr) {
			minHeap.add(num);
			
		}
		System.out.println("Min heap created from the array");
		System.out.println(minHeap);
		
		System.out.println("Dequeue elements of priority queue");
		while(!minHeap.isEmpty()) {
			int min = minHeap.poll();
			System.out.print(min+" ");
			System.out.println(minHeap);
		}
		

	}

}
