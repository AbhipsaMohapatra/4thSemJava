package Assignment6Actual;

//import DataStructures.Node;

class Node2{
	int data;
	Node2 left;
	Node2 right;
	Node2(int data){
		this.data = data;
		left =null;
		right =null;
	}
}

public class Q5 {
	Node2 root;
	void insert(int key) {
		root = insertrec(root,key);
	}
	Node2 insertrec(Node2 root,int key) {
		if(root==null) {
			System.out.println("Inserted "+key);
			return new Node2(key);
			
		}
		if(key<root.data) {
//			System.out.println("Inserting "+key+" to the left of "+ root.data);
			root.left = insertrec(root.left, key);
		}
		else if(key>root.data) {
//			System.out.println("Inserting "+key+" to the right of "+ root.data);
			root.right = insertrec(root.right, key);
		}
		else {
			System.out.println("key already exists in the tree ");
		}
		return root;
	}
	public void inorder(Node2 root) {
		if(root!=null) {
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
			
		}
	}
	public Node2 deleteRec(Node2 root,int key) {
		if(root==null) {
			return root;
			
		}
		if(key<root.data) {
			root.left = deleteRec(root.left, key);
		}
		else if(key>root.data) {
			root.right = deleteRec(root.right, key);
		}
		else {
			if(root.left==null) {
				return root.right;
			}
			else if(root.right==null) {
				return root.left;
			}
			root.data = minvalue(root.right);
			root.right=deleteRec(root.right,root.data);
			
		}
		return root;
	}
	public int minvalue(Node2 root) {
		int minv = root.data;
		while(root.left!=null) {
			minv = root.left.data;
			root = root.left;
		}
		return minv;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q5 treeQ5 = new Q5();
		treeQ5.insert(100);
		treeQ5.insert(20);
		treeQ5.insert(30);
//		treeQ5.insert(10);
		treeQ5.insert(40);
		treeQ5.insert(150);
		treeQ5.inorder(treeQ5.root);
		int key = 40;
		System.out.println(" Deleated leaf node ");
		treeQ5.deleteRec(treeQ5.root, key);
		treeQ5.inorder(treeQ5.root);
		System.out.println();
		System.out.println(" Delete with one node as child ");
		int key2 = 20;
		treeQ5.deleteRec(treeQ5.root, key2);
		treeQ5.inorder(treeQ5.root);
		System.out.println();
		System.out.println(" delete root ");
		int key3 = 100;
		treeQ5.deleteRec(treeQ5.root, key3);
		treeQ5.inorder(treeQ5.root);
		System.out.println();
		System.out.println(treeQ5.root.data);
		
		
		
		

	}

}
//output
//Inserted 100
//Inserted 20
//Inserted 30
//Inserted 40
//Inserted 150
//20 30 40 100 150  Deleated leaf node 
//20 30 100 150 
// Delete with one node as child 
//30 100 150 
// delete root 
//30 150 
//150
//
