package in.ineuron.cn;

public class CountLeafNodes {
	
	public static int countLeafNodes(TreeNode<Integer> root){
		// Write your code here
		if(root == null) return 0;

		int n = root.children.size();
		if(n == 0) return 1;

		int count = 0;

		for(int i = 0; i < n; i++){
			count = count + countLeafNodes(root.children.get(i));
		}
		
		return count;

	}
}
