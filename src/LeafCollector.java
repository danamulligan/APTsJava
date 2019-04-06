
import java.util.*;

public class LeafCollector {
    private ArrayList<String> lis;
    private String con;
    private HashSet<TreeNode> map;
    
    public String[] getLeaves(TreeNode t) {
        lis = new ArrayList<>();
        con = "";
        if(t == null) return new String[0];
        
        while(t.left != null || t.right != null) {
            map = new HashSet<>();
            lis.add(leavesList(t));
            destroy(t);
            con = "";
        }
        if(t.left == null && t.right == null) lis.add(t.info + "");
        String[] res = new String[lis.size()];
        for(int k=0; k<lis.size()-1; k++) {
            res[k] = lis.get(k);
        }
        
        for(int k=0; k<res.length-1; k++) {
        	StringBuilder fix = new StringBuilder();
            String holder = res[k];
            fix.append(holder);
            fix.reverse();
            fix.deleteCharAt(0);
            fix.reverse();
            res[k] = fix.toString();
        }
        res[lis.size()-1] = lis.get(lis.size()-1);
        return res;
    }
    
    public String leavesList(TreeNode t) {
        
        if(t == null) return con;
        if(t.left == null && t.right == null)
        {
            con = con + t.info + " ";
            map.add(t);
        }
        if(t.left != null) leavesList(t.left);
        if(t.right != null) leavesList(t.right);

        return con;
    }
    public TreeNode destroy(TreeNode t) {
        if(t == null) return null;
        if(t.left != null) {
                if(destroy(t.left) == null){
                  t.left = null;
                }
        }
        if(t.right != null) {
                if(destroy(t.right) == null){
                  t.right = null;
                }
        }
        if(map.contains(t)) t = null;
        return t;
    }
    public static void main(String[] args) {
        TreeNode t = new TreeNode(1, new TreeNode(2, new TreeNode(4, null, null), new TreeNode(5, null, null)), new TreeNode(3, null, null));
        LeafCollector o = new LeafCollector();
        o.getLeaves(t);   
    }
}
