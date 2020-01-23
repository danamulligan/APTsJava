import java.util.*;

public class UniqueTreeValues {
		private TreeSet<Integer> list;
        public int[] unique(TreeNode root) {
        	list = new TreeSet<>();
        	list.add(root.info);
            // write code here
        	getNodes(root);
        	int[] ret = new int[list.size()];
        	int noLoop = 0;
        	for(Integer i : list) {
        		ret[noLoop] = i;
        		noLoop++;
        	}
            return ret;
        }
        public void getNodes(TreeNode t) {
        	
        	
        	if(t.left == null || t.right==null) {
        		list.add(t.info);
        	}
        	
        	if(t.left != null) getNodes(t.left);
        	if(t.right != null) getNodes(t.right);
        	
        }
    }