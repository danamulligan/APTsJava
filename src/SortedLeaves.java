import java.util.ArrayList;
import java.util.Collections;

public class SortedLeaves {
	private ArrayList<Character> myList;
        public String[] values(TreeNode root) {
            // replace with working code
        	myList = new ArrayList<>();
        	
        	if(root == null) return new String[0];
        	doWork(root);
        	Collections.sort(myList);
        	String[] ans = new String[myList.size()];
        	for(int k=0; k<myList.size(); k++)
        	{
        		ans[k] = myList.get(k).toString();
        	}
        	return ans;
        }
        private void doWork(TreeNode t) {
        	if(t == null) return;
        	if(t.left == null && t.right == null) {
        		myList.add((char)(t.info));
        		return;
        	}
        	doWork(t.left);
        	doWork(t.right);
        }
    }