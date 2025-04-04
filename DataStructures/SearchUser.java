package DataStructures;

public class SearchUser {
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
	public void inOrderTraversal(Node root) {
		if(root!=null) {
			inOrderTraversal(root.left);
			System.out.print(root.key+" ");
			inOrderTraversal(root.right);
		}
	}
	public boolean SearchKey(int key) {
		return searchRec(root,key);
	}
	boolean searchRec(Node root,int key) {
		if(root==null || root.key==key) {
			return root!=null;
		}
		if(root.key<key) {
			return searchRec(root.right, key);
		}
		return searchRec(root.left, key);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchUser tree = new SearchUser();
		
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		tree.inOrderTraversal(tree.root);
		System.out.println();
		int searchKey = 40;
		if(tree.SearchKey(searchKey)) {
			System.out.println("Element "+searchKey+" is found in the binary tree");
		}
		else {
			System.out.println("Key not found");
		}

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
//20 30 40 50 60 70 80 
//Element 40 is found in the binary tree
//
