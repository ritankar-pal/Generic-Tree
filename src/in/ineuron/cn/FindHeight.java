package in.ineuron.cn;

public class FindHeight {

	public static int getHeight(TreeNode<Integer> root){

		if(root == null) return 0; 

		int height = 1;
		int temp = 0;

		for(int i = 0; i < root.children.size(); i++){
			int childHeight = getHeight(root.children.get(i));
			temp = Math.max(temp, childHeight);
		}

		height = height + temp;

		return height;

	}
}
