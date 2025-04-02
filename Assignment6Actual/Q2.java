package Assignment6Actual;
class Node{
	int data;
	Node left,right;
	public Node(int item) {
		data = item;
		left=null;
		right=null;
	}
}

public class Q2 {
	Node root;
	//Array should be sorted
	public Node createTree(int[] arr,int start,int end) {
		if(start>end) {
			return null;
			
		}
		int mid = (start+end)/2;
		Node node = new Node(arr[mid]);
		node.left = createTree(arr, start, mid-1);
		node.right = createTree(arr, mid+1, end);
		return node;
	}
	public void inorderTraversal(Node root) {
		if(!(root==null)) {
			inorderTraversal(root.left);
			System.out.print(root.data+" ");
			inorderTraversal(root.right);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q2 tree = new Q2();
		int[] arr = {10,20,30,40,50,60,70,80,90,100};
		int n = arr.length;
		tree.root = tree.createTree(arr, 0, n-1);
		System.out.println("Inorder traversalof BST");
		tree.inorderTraversal(tree.root);

	}

}
