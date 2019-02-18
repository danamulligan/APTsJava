
public class StringCuts {
	public String[] filter(String[] list, int minLength) {

		int count = good(list, minLength);
		String[] longE = new String[count];
		//HashSet<String> already = new HashSet<>();
		String tally = "";
		int i = 0;
		for(String s : list) 
		{
			if(longEnough(s, minLength)) 
			{
				if(!tally.contains(s))
				{
					longE[i] = s;
					i++;
					tally += s;
				}

			}

		}

		//longEnough = already.toArray(new String [0]);
		return longE;
	}
	/*public boolean isIn(HashSet<String> already, String s, int minLength) {
		HashSet<String> newer = new HashSet<>();

		return false;
	}
	 */

	public int good(String[] list, int minLength) 
	{
		int count = 0;
		String tally = "";
		for(String s : list) 
		{
			if(!tally.contains(s)) {
				tally += s;
				if(s.length() >= minLength) 
				{
					count++;
				}
			}

		}
		return count;
	}

	public boolean longEnough(String word, int minLength) {
		if(word.length() >= minLength) 
		{
			return true;
		}
		return false;
	}


}