package searching;

import java.util.LinkedList;
import java.util.Queue;

public class SearchNodeReturnParent {
	private class TreeNode{
		private int val;
		private TreeNode left,right;
		private boolean visited;
		private TreeNode(int val){
			this.val = val;
			this.left =null;
			this.right = null;
		}
	}
	
	public TreeNode createSampleTree(){
		TreeNode root = new TreeNode(10);
		TreeNode a = new TreeNode(4);
		TreeNode b = new TreeNode(3);
		TreeNode c = new TreeNode(5);
		TreeNode d = new TreeNode(7);
		TreeNode e = new TreeNode(9);
		TreeNode f = new TreeNode(8);
		root.left =a;
		root.right = b;
		a.left = c;
		a.right = d;
		b.left = e;
		b.left = f;
		return root;
		
	}
	
	public TreeNode getUnvisitedChild(TreeNode node){
		if(node.left!=null){
			if(!node.left.visited){
				return node.left;
			}
		}
		if(node.right!=null){
			if(!node.right.visited){
				return node.right;
			}
		}
		return node;
	}
	
	public void searchBfs(TreeNode root, int searchVal){
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()){
			TreeNode node = queue.remove();
			System.out.println(queue.size() + node.val);
			TreeNode child =null;
			if(node.val != searchVal){
				while((child=getUnvisitedChild(node))!=null){
					child.visited =true;
					if(child.val== searchVal){
						System.out.println("Parent is : "+node.val);
					}
					queue.add(child);
				}
			}else{
				System.out.println("It is the only element, there is no parent");
			}
		}
			
			System.out.println("There is no element found");
	}
	 public static void main(String[] args){
		 System.out.println("Search");
	    	SearchNodeReturnParent ob = new SearchNodeReturnParent();
	    	TreeNode tree = ob.createSampleTree();
	    	ob.searchBfs(tree, 7);
	    	
	    }
}
