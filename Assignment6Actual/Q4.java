package Assignment6Actual;

import java.util.List;
import java.util.function.IntToDoubleFunction;

//import DataStructures.Node;

class Country{
	
	String name;
    double population;
    Country(String n,double d){
    	this.name = n;
    	this.population =d;
    }
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPopulation() {
		return population;
	}
	public void setPopulation(double population) {
		this.population = population;
	}
    @Override
    public String toString() {
    	return this.name+" "+this.population;
    }
	
}
class BNode{
	Country data;
	BNode left;
	BNode right;
	BNode(Country d){
		this.data = d;
		this.left = null;
		this.right = null;
	}
	
	
}

public class Q4 {
	BNode root;
	void insert(Country key) {
		root = insertrec(root,key);
	}
	BNode  insertrec(BNode root,Country key) {
		if(root==null) {
//			System.out.println("Inserted "+key);
			return new BNode(key);
			
		}
		if(key.population<root.data.population) {
//			System.out.println("Inserting "+key+" to the left of "+ root);
			root.left = insertrec(root.left, key);
		}
		else if(key.population>root.data.population) {
//			System.out.println("Inserting "+key+" to the right of "+ root);
			root.right = insertrec(root.right, key);
		}
		else {
			System.out.println("key already exists in the tree ");
		}
		return root;
	}
	BNode getMin(BNode root) {
		if(root==null) {
			return null;
		}
		BNode current = root;
		while(current.left!=null) {
			current=current.left;
		}
		return current;
	}
	BNode getMax(BNode root) {
		if(root == null) {
			return null;
		}
		BNode current = root;
		while(current.right!=null) {
			current=current.right;
		}
		return current;
	}
	
	public void inorderTraversal(BNode root) {
		if(!(root==null)) {
			inorderTraversal(root.left);
			System.out.print(root.data+" ");
			inorderTraversal(root.right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country c1 = new Country("America",12345);
		Country c2 = new Country("Athens", 123.678);
		Country c3 = new Country("Arabia", 234.987);
		Country c4 = new Country("Russia", 56.90);
		Q4 treeQ4 = new Q4();
		treeQ4.insert(c1);
		treeQ4.insert(c2);
		treeQ4.insert(c3);
		treeQ4.insert(c4);
		System.out.println("The inorder traversal is");
		treeQ4.inorderTraversal(treeQ4.root);
		System.out.println();
		Country min = treeQ4.getMin(treeQ4.root).data;
		Country max = treeQ4.getMax(treeQ4.root).data;
		System.out.println("the min population country us "+min);
		System.out.println("The max population is "+max);

	}

}
 

