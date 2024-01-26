package in.ineuron.cn;

public class StructurallyIdentical {
	
	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){
		// Write your code here
		if(root1 == null || root2 == null)

		if(root1.data != root2.data) return false;

		if(root1.children.size() != root2.children.size()) return false;

		for(int i = 0 ; i < root1.children.size(); i++){
			boolean child = checkIdentical(root1.children.get(i), root2.children.get(i));
			if(!child) return false;
		}
		return true;
	}
	
}
