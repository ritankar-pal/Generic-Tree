package in.ineuron.cn;

import java.util.LinkedList;
import java.util.Queue;


public class SumOfChildrenAndNodeIsMax {
	
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		// Write your code here
		if(root == null) return null;

		Queue<TreeNode<Integer>> queue = new LinkedList<>();

		queue.add(root);

		TreeNode<Integer> res = null;

		int maxSum = Integer.MIN_VALUE;

		while(!queue.isEmpty()){

			int sum = 0; 

			TreeNode<Integer> node = queue.poll();

			sum = sum + node.data;

			for(int i = 0; i < node.children.size(); i++){
				sum = sum + node.children.get(i).data;
				queue.add(node.children.get(i));
			}

			if(sum > maxSum){
				maxSum = sum;  //16
				res = node;
			}
		}

		return res;
	}
}
