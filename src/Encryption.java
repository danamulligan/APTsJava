import java.util.HashMap;
import java.util.HashSet;

public class Encryption {
	public String encrypt(String message){
		// you write code here
		int counter = 'a';
		String[] letters = message.split("");
		String ret = "";




		return ret;
	}
	public int place(String[] letters)
	{
		HashSet<String> known = new HashSet<>();
		char[] seen = new char[numUnique(letters)];

		for(int k=0; k<seen.length; k++)
		{
			for (int r=0; r<letters.length; r++)
			{
				if (letters[r].equals(seen[k]))
				{
					return k;
				}
				if (!known.contains(letters[r]]))
				{
					
				}
				known.add(letters[r]);
				
			}
		}

		return k;
	}
	public int numUnique(String[] letters) {
		HashSet<String> let = new HashSet<>();
		int unique = 0;
		for(int k=0; k<letters.length; k++)
		{
			if(!let.contains(letters[k]))
			{
				unique += 1;
			}
			let.add(letters[k]);
		}
		return unique;
	}

}