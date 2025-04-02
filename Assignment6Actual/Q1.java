package Assignment6Actual;

//import DataStructures.Node;

class BSTNode{
	int info;
	BSTNode left,right;
	public BSTNode(int info) {
		// TODO Auto-generated constructor stub
		this.info = info;
		left=null;
		right=null;
		
	}
	
}
public class Q1 {
	BSTNode root;
	void insert(int key) {
		root = insertrec(root,key);
	}
	BSTNode insertrec(BSTNode root,int key) {
		if(root==null) {
			System.out.println("Inserted "+key);
			return new BSTNode(key);
			
		}
		if(key<root.info) {
			System.out.println("Inserting "+key+" to the left of "+ root.info);
			root.left = insertrec(root.left, key);
		}
		else if(key>root.info) {
			System.out.println("Inserting "+key+" to the right of "+ root.info);
			root.right = insertrec(root.right, key);
		}
		else {
			System.out.println("key already exists in the tree ");
		}
		return root;
	}
	public  void inOrdertraversal(BSTNode root) {
		if(!(root==null)) {
			inOrdertraversal(root.left);
			System.out.print(root.info+" ");
			inOrdertraversal(root.right);
		}
	}
	public void preOrdertraversal(BSTNode  root) {
		if(!(root==null)) {
			System.out.print(root.info+" ");
			preOrdertraversal(root.left);
			preOrdertraversal(root.right);
		}
	}
	public void postordertraversal(BSTNode root) {
		if(!(root==null)) {
			postordertraversal(root.left);
			postordertraversal(root.right);
			System.out.print(root.info+" ");
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q1 tree = new Q1();
		tree.insert(10);
		tree.insert(45);
		tree.insert(34);
		tree.insert(2);
		System.out.println("the inorder traversal in ");
		tree.inOrdertraversal(tree.root);
		System.out.println();
		System.out.println("  the post order traversal");
		System.out.println();
		tree.postordertraversal(tree.root);
		System.out.println();
		System.out.println( " the pre order traversal ");
		tree.preOrdertraversal(tree.root);

	}

}

//output
//Inserted 10
//Inserting 45 to the right of 10
//Inserted 45
//Inserting 34 to the right of 10
//Inserting 34 to the left of 45
//Inserted 34
//Inserting 2 to the left of 10
//Inserted 2
//the inorder traversal in 
//2 10 34 45 
//  the post order traversal
//
//2 34 45 10 
// the pre order traversal 
//10 2 45 34 
