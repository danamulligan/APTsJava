
public class HeavyWords {
	public double average(String[] words){
		double sumLen = 0.0;
		double count = 0.0;
		int[] alpha = numStart(words);
		int most_common = maxNum(alpha) + 'a';
		
		for(String w : words) {
			if(startsWith(most_common, w))
			{
				sumLen += w.length();
				count += 1;
			}
		}

		return sumLen/count;
	}

	public int[] numStart(String[] words) 
	{
		int[] alpha = new int[26];
		String holder = "";
		
		for(int i=0; i<words.length; i++) 
		{
			holder = words[i];
			for(int k='a'; k<'z'+1; k++)
			{
				char c = holder.charAt(0);
				int let = Character.getNumericValue(c) + 87;
				if(let == k)
				{
					alpha[k-'a'] += 1;
				}
			}
		}
		
		return alpha;
	}

	public int maxNum(int[] alpha) 
	{
		int max = 0;
		int max_pos = 0;
		
		for(int k=0; k<alpha.length; k++) 
		{
			if(alpha[k] > max)
			{
				max = alpha[k];
				max_pos = k;
			}
		}
		
		return max_pos;
	}


	public boolean startsWith(int most, String word)
	{
		char first = word.charAt(0);
		int val = Character.getNumericValue(first) + 87;
		
		if(val == most)
		{
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) 
	{
		HeavyWords o = new HeavyWords();
		//define params
		String[] words = {"apple", "ant", "almost", "bear" };
		double result = o.average(words);
		System.out.println(result);
	}

}
