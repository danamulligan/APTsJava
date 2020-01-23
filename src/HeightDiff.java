

public class HeightDiff {
	private int big = 0;
	public int maxhd(TreeNode root) {
        // write code here
		if(finddif(root) > big) {
			big = finddif(root);
			System.out.println(finddif(root));
		}
		if(root.left != null) maxhd(root.left);
		if(root.right != null) maxhd(root.right);
		
        return big;
	}
	public int height(TreeNode root){
		if (root == null) return 0;
		return 1 + Math.max(height(root.left), height(root.right));
	}
	public int finddif(TreeNode root) {
		if(height(root.right)>height(root.left))
			return height(root.right)-height(root.left);
		return height(root.left) - height(root.right);
	}
}
