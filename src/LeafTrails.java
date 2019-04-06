
import java.util.TreeMap;

 public class LeafTrails {
	 private TreeMap<Integer, String> map;
     public String[] trails(TreeNode root) {
         // replace with working code
     	map = new TreeMap<>();
     	if(root == null) return new String[0];
     	helper(root,"");
     	String[] go = new String[map.size()];
     	int index  = 0;
     	for(int k : map.keySet()){
     		go[index] = map.get(k);
     		index += 1;
     	}
     	return go;
     	
     }
     public void helper(TreeNode t, String path) {
     	if(t == null) return;
     	
     	if(t.left == null && t.right == null)
     	{
     		map.put(t.info, path);
     		return;
     	}
     	
     	helper(t.left, path + "0");
     	helper(t.right, path + "1");
     	
     }
    }