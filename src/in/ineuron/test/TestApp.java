package in.ineuron.test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import in.ineuron.cn.TreeNode;


public class TestApp {


	public static void takeInputIterative() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Tree root: ");
		
		int data = scan.nextInt();
		
		if(data == -1) return;
		
		TreeNode<Integer> root = new TreeNode<>(data);
		
		Queue<TreeNode<Integer>> queue = new LinkedList<>();
		
		queue.add(root);
		
		while(!queue.isEmpty()) {
			
			TreeNode<Integer> node = queue.poll();
			
			System.out.print("Enter the Number of Children of the node " + node.data + ": ");
			int childrenCount = scan.nextInt();
			
			for(int i = 0; i < childrenCount; i++) {
				
				System.out.print("Enter Child " + (i+1) + " of " + childrenCount + ": ");
				int childData = scan.nextInt();
				TreeNode<Integer> childNode = new TreeNode<>(childData);
				
				//Adding the Child Nodes in the Queue:
				queue.add(childNode);
				
				//Adding the child Nodes in the parent ArrayList<>:
				node.children.add(childNode);
			}
		}
		
		printTree(root);
		
	}
 	

	public static int countNodes(TreeNode<Integer> root) {

		if(root == null) return 0;

		int count = 0;
		for(int i = 0; i < root.children.size(); i++) {
			count = count + countNodes(root.children.get(i));
		}

		return 1 + count;
	}


	public static void printTree(TreeNode<Integer> root) {

		//Special Case not the base case:
		if(root == null) return;

		System.out.print(root.data + ": ");

		for(int i = 0; i < root.children.size(); i++) {
			TreeNode<Integer> child = root.children.get(i);
			System.out.print(child.data + " ");
		}

		System.out.println();
		for(int i = 0; i < root.children.size(); i++) {
			TreeNode<Integer> child = root.children.get(i);
			printTree(child);
		}

	}


	public static void main(String[] args) {

//		TreeNode<Integer> root = new TreeNode<>(4);
//
//		TreeNode<Integer> node1 = new TreeNode<>(2);
//		TreeNode<Integer> node2 = new TreeNode<>(3);
//		TreeNode<Integer> node3 = new TreeNode<>(1);
//		TreeNode<Integer> node4 = new TreeNode<>(5);
//		TreeNode<Integer> node5 = new TreeNode<>(6);
//
//		root.children.add(node1);
//		root.children.add(node2);
//		root.children.add(node3);
//
//		node2.children.add(node4);
//		node2.children.add(node5);
//
//		printTree(root);
//		System.out.println();
//
//		System.out.println("Total No of Nodes: " + countNodes(root));
		
		takeInputIterative();

	}

}
