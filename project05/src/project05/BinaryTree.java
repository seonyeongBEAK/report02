package project05;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<Key extends Comparable<Key>> {
	private BTNode<Integer> root;
	public BinaryTree() {root = null;}
	public BTNode<Integer> getRoot() {return root;}
	public void setRoot(BTNode<Integer> newRoot) {root = newRoot;}
	public boolean isEmpty() {return root == null;}
	
	public void preorder(BTNode<Integer>n) {
		if(n != null) {
			System.out.print(n.getKey()+" ");
			preorder(n.getLeft());
			preorder(n.getRight());
		}
	}
	
	public void inorder(BTNode<Integer>n) {
		if(n != null) {
			preorder(n.getLeft());
			preorder(n.getRight());
			System.out.print(n.getKey()+" ");
		}
	}
	
	public int size(BTNode <Integer>n) {
		if(n == null)
			return 0;
		else
			return (1+size(n.getLeft()) + size(n.getRight()));
	}
	
	public int height(BTNode<Integer> n) {
		if(n == null)
			return 0;
		else
			return(1 + Math.max(height(n.getLeft()), height(n.getRight())));
		
	}
	public static boolean isEqual(BTNode<Integer> n, BTNode<Integer> m){
		
		if(n==null || m==null) 
		return n == m; 
		if (n.getKey().compareTo(m.getKey()) != 0)
		return false;
		return( isEqual(n.getLeft(), m.getLeft()) &&
		
		isEqual(n.getRight(), m.getRight()) );
		}
		public BTNode<Integer> copy (BTNode<Integer> n) {
		BTNode<Integer> left, right;
		if (n == null) return null;
		else {
		left = copy(n.getLeft());
		right = copy(n.getRight());
		return new BTNode<Integer>(n.getKey(),left, right);
		}
	}
		public void levelorder(BTNode<Integer> root) { // 레벨 순회
			Queue<BTNode<Integer>> q = new LinkedList<BTNode<Integer>>();
			
			BTNode<Integer> t;
			q.add(root);
			while (!q.isEmpty()) {
			t = q.remove(); 
			System.out.print(t.getKey()+" "); 
			if (t.getLeft() != null) 
			q.add(t.getLeft()); 
			if (t.getRight() != null) 
			q.add(t.getRight()); 
			}
		}
}
