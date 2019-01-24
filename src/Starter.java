
public class Starter {
	public int begins(String[] words, String first) 
	{
		String word = "";
		int count = 0;

		for (int k=0; k<words.length; k++) //loops through all of the words in words
		{
			word = words[k];
			
			if (firstLetter(word, first) && !repeat(words, word, k)) 
			{
				count+=1;
			}
		}
		return count;
	}

	private boolean firstLetter(String word, String first) 
	{
		String[] wordList = word.split("");

		if (wordList[0].equals(first)) 
		{
			return true;
		}
		return false;
	}
//make sure that the word is recurring for the second time!! otherwise it cuts it
	private boolean repeat(String[] words, String word, int place) 
	{
		for (int k=0; k<words.length; k++)
		{
			if (place != k && words[k].equals(word) && place>k) 
			{
				return true;
			}
		}
		return false;
	}
}