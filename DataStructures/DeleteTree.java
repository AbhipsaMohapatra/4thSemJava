package DataStructures;

public class DeleteTree {
	

	
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
		public Node deleteRec(Node root,int key) {
			if(root==null) {
				return root;
				
			}
			if(key<root.key) {
				root.left = deleteRec(root.left, key);
			}
			else if(key>root.key) {
				root.right = deleteRec(root.right, key);
			}
			else {
				if(root.left==null) {
					return root.right;
				}
				else if(root.right==null) {
					return root.left;
				}
				root.key = minvalue(root.right);
				root.right=deleteRec(root.right,root.key);
				
			}
			return root;
		}
		public int minvalue(Node root) {
			int minv = root.key;
			while(root.left!=null) {
				minv = root.left.key;
				root = root.left;
			}
			return minv;
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteTree tree = new DeleteTree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		tree.inOrderTraversal(tree.root);
		System.out.println();
		int keyDelete = 50;
		tree.deleteRec(tree.root, keyDelete);
		System.out.println("inorder traversal after deletion ");
		
		tree.inOrderTraversal(tree.root);

	}

}
