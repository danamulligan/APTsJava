
public class SandwichBar
{
	private boolean cont(String one, String[] avail) {
		for (String s : avail) {
			if (one.equals(s)) {
				return true;
			}
		}
		return false;
	}

	private boolean can(String sand, String[] availa) {
		String[] ing = sand.split(" ");
		for(String one : ing) {
			if (! cont(one, availa)) {
				return false;
			}
		}
		return true;
	}

	public int whichOrder(String[] availab, String[] orde) {
		for (int k=0; k<orde.length; k+=1) {
			if (can(orde[k], availab)) {
				return k;
			}
		}
		return -1;
	}
}