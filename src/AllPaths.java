import java.util.ArrayList;
import java.util.Collections;

public class AllPaths {
	private ArrayList<String> myList;
        public String[] paths(TreeNode root) {
            // replace with working code
        	myList = new ArrayList<>();
        	if(root == null) return new String[0];
        	findPaths(root,"");
        	Collections.sort(myList);
        	return myList.toArray(new String[0]);
        	
        }
        public void findPaths(TreeNode t, String path) {
        	if(t == null) return;
        	
        	if(t.left == null && t.right == null)
        	{
        		path = path + t.info;
        		myList.add(path);
        		return;
        	}
        	path = path + t.info + "->";
        	
        	if(t.left != null)
        	{
        		findPaths(t.left, path);
        	}
        	if(t.right != null)
        	{
        		findPaths(t.right, path);
        	}
        }
        
        
        
    }