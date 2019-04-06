
public class LevelCount {
	
        public int count(TreeNode t, int level) {
            // replace with working code
        	if(t == null) return 0;
        	if(level == 0) return 1;
        	int newLevel = level-1;
        	return count(t.left, newLevel) + count(t.right, newLevel);
        }       
    }
