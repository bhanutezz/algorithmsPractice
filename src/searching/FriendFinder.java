package searching;

import java.util.*;
class Node{
	int data;
	Node left;
	Node right;
	Node friend;
	public Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
		this.friend = null;
	}
	public String toString(){
		if(friend != null)
		return " " + data + " : "+friend.data;
		else
			return " "+data+ " : NULL";
	}
}

public class FriendFinder{
	
	public static void printFriends(Node root){
		if(root == null)
		 {
		 	System.out.println("empty");
		 	return;
		 }
		else{
		Queue<Node> q1 = new LinkedList<Node>();	
		Queue<Node> q2 = new LinkedList<Node>();	
		q1.add(root);
		while(!q1.isEmpty() || !q2.isEmpty()){
			while(!q1.isEmpty())
				{
					if(q1.peek().left != null)
						q2.add(q1.peek().left);
					if(q1.peek().right != null)
						q2.add(q1.peek().right);
					Node pickedNode = q1.poll();
					pickedNode.friend = q1.peek();
					System.out.println(pickedNode);
				}
			while(!q2.isEmpty()){
					if(q2.peek().left != null)
						q1.add(q2.peek().left);
					if(q2.peek().right != null)
						q1.add(q2.peek().right);
					Node pickedNode = q2.poll(); 
					pickedNode.friend = q2.peek();
					System.out.println("Q2 values");
					System.out.println(pickedNode);
				}
			}
		}	
	}
	public static void main(String []args){
		Node root = new Node (1);
		Node n2 = new Node (2);
		Node n3 = new Node (3);
		Node n4 = new Node (4);
		Node n5 = new Node (5);
		Node n6 = new Node (6);
		root.left = n2; root.right = n3;
		n2.left = n4; 
		n3.left = n5;
		n3.right = n6;
		/*
			1
		   2   3
		  4   5  6
		*/
		printFriends(root);
		
	}
}