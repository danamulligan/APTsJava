
public class Starter {
	public int begins(String[] words, String first) 
	{
		System.out.println("New Test!!");
		System.out.print("letter I\'m checking: ");
		System.out.println(first);

		String word = "";
		int count = 0;

		for (int k=0; k<words.length; k++) //loops through all of the words in words
		{
			word = words[k];
			System.out.println("Next word I'm trying: " + word);
			if (firstLetter(word, first) && !repeat(words, word, k)) 
			{
				count+=1;
				System.out.print("word I found: ");
				System.out.println(word);
				System.out.print("k: ");
				System.out.println(k);
			}
		}
		System.out.println("");
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
//make sure that the word is reacurring for the second time!! otherwise it cuts it
	private boolean repeat(String[] words, String word, int place) 
	{
		System.out.print("place: ");
		System.out.println(place);
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