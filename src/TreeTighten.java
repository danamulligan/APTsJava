
public class TreeTighten {
        
	public TreeNode tighten(TreeNode t) {
            // replace with working code
        	if(t == null) return null;
        	if(t.left == null && t.right == null)
        	{
        		return t;
        	}
        	if(t.left == null && t.right != null)
        	{
        		//if root only has one child, t = child
        		t = tighten(t.right);
        	}
        	if(t.left != null && t.right == null)
        	{
        		t = tighten(t.left);
        	}
        	if(t.left != null && t.right != null) {
        		t.left = tighten(t.left);
        		t.right = tighten(t.right);
        	}
            return t;
        }
}