
public class TreeCount {
    public int count(TreeNode t) {
        // replace with working code
    	if(t == null) return 0;
        return 1 + count(t.left)+ count(t.right) ;
    }
}