package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

class Node{
	int key;
	Node left,right;
	public Node(int item) {
		this.key = item;
		left=null;
		right=null;
	}
	
}

public class Trees {
	Node root;
	void insert(int key) {
		root = insertrec(root,key);
	}
	Node insertrec(Node root,int key) {
		if(root==null) {
			System.out.println("Inserted "+key);
			return new Node(key);
			
		}
		if(key<root.key) {
			System.out.println("Inserting "+key+" to the left of "+ root.key);
			root.left = insertrec(root.left, key);
		}
		else if(key>root.key) {
			System.out.println("Inserting "+key+" to the right of "+ root.key);
			root.right = insertrec(root.right, key);
		}
		else {
			System.out.println("key already exists in the tree ");
		}
		return root;
	}
	//BFS traversal
	public void levelorder() {
		if(root==null) {
			return;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node tempNode = queue.poll();
			System.out.print(tempNode.key+" ");
			if(tempNode.left !=null) {
				queue.add(tempNode.left);
			}
			if(tempNode.right!=null) {
				queue.add(tempNode.right);
			}
		}
	}
	public void inOrderTraversal(Node root) {
		if(root!=null) {
			inOrderTraversal(root.left);
			System.out.print(root.key+" ");
			inOrderTraversal(root.right);
		}
	}
	public void preOrderTraversal(Node root) {
		if(root!=null) {
			System.out.print(" "+root.key);
			
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}
	public void postOrderTraversal(Node root) {
		if(root!=null) {
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.print(" "+ root.key);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trees trees = new Trees();
		trees.insert(50);
		trees.insert(30);
		trees.insert(20);
		trees.insert(40);
		trees.insert(70);
		trees.insert(60);
		trees.insert(80);
		trees.levelorder();
		System.out.println();
		System.out.println("inorder traversal");
		trees.inOrderTraversal(trees.root);
		System.out.println();
		System.out.println("pre order traversal");
		trees.preOrderTraversal(trees.root);
		System.out.println();
		System.out.println("post order traversal");
		trees.postOrderTraversal(trees.root);
		System.out.println();

	}

}

//output
//Inserted 50
//Inserting 30 to the left of 50
//Inserted 30
//Inserting 20 to the left of 50
//Inserting 20 to the left of 30
//Inserted 20
//Inserting 40 to the left of 50
//Inserting 40 to the right of 30
//Inserted 40
//Inserting 70 to the right of 50
//Inserted 70
//Inserting 60 to the right of 50
//Inserting 60 to the left of 70
//Inserted 60
//Inserting 80 to the right of 50
//Inserting 80 to the right of 70
//Inserted 80
//50 30 70 20 40 60 80 
//inorder traversal
//20 30 40 50 60 70 80 
//pre order traversal
// 50 30 20 40 70 60 80
//post order traversal
// 20 40 30 60 80 70 50
//
