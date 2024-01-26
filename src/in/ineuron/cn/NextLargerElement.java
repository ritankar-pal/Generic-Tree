package in.ineuron.cn;


public class NextLargerElement {

	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		// Write your code here
		if(root == null) return null;

		TreeNode<Integer> res = null;

		for(int i = 0; i < root.children.size(); i++){

			TreeNode<Integer> child = findNextLargerNode(root.children.get(i), n);

			if(child != null && child.data > n){
				if(res == null) res = child;
				else{
					if(child.data < res.data) res = child;
				}
			}
		}

		//Comparing the root's value if root.data > n:
		if(root.data > n){
			if(res == null) return root;
			else{
				if(root.data < res.data) res = root;
			}
		}

		return res;
	}
	
}
