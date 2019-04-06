import java.util.*;

public class PathSum {
        public int hasPath(int target, TreeNode tree){
            
        	if(sumPath(tree).contains(target)) return 1;        	
            return 0;
        }
        public ArrayList<Integer> sumPath(TreeNode tree) {
        	ArrayList<Integer> options = new ArrayList<>();
        	ArrayList<Integer> up = new ArrayList<>();
        	if(tree == null) {
        		up.add(0);
        		return up;
        	}
        	if(tree.left == null && tree.right == null)
        		{
        			up.add(tree.info);
        			return up;
        		}
        	
        	options.addAll(sumPath(tree.left));
        	options.addAll(sumPath(tree.right));
        	
        	for(int k=0; k<options.size(); k++)
        	{
        		int l = options.get(k);
        		up.add(tree.info  + l);
        	}	
          	return up;
        }
    }