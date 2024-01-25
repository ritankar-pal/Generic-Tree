package in.ineuron.cn;

import java.util.LinkedList;
import java.util.Queue;

public class LevelWisePrint {

	public static void printLevelWise(TreeNode<Integer> root){

		if(root == null) return;

		Queue<TreeNode<Integer>> queue = new LinkedList<>();
		queue.add(root);

		while(!queue.isEmpty()){

			int size = queue.size();

			for(int i = 0; i < size; i++){

				TreeNode<Integer> node = queue.poll();
				System.out.print(node.data + " ");

				//Adding the children in the queue:
				for(int j = 0; j < node.children.size(); j++){
					queue.add(node.children.get(j));
				}

			}
			System.out.println();
		}

	}
}
