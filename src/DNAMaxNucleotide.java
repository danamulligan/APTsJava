
public class DNAMaxNucleotide {
	public String max(String[] strands, String nuc) 
	{
		String maxNuc = "";
		int place = wordComparePlace(strands, nuc);
		if (place != -1) 
		{
			maxNuc = strands[place];
		}
		return maxNuc;
	} 

	private int charCounter(String word, String character) 
	{
		int count = 0; //var to count how many times character is in word
		String[] wordList = word.split("");
		
		for (int k=0; k<wordList.length; k+=1) 
		{	
			if (wordList[k].equals(character)) 
			{
				count += 1;
			}
		}
		return count;
	}

	private int wordComparePlace(String[] strands, String nuc) 
	{
		int numb = 0;
		int place = -1;
		int leng = 0;
		for (int k=0; k<strands.length; k++) 
		{
			int thisNum = charCounter(strands[k], nuc);
			if (thisNum > numb && thisNum != 0) 
			{
				place = k;
				numb = thisNum;
				leng = strands[k].length();
			}
			else if (thisNum == numb && strands[k].length() > leng && thisNum != 0)
			{
				place = k;
				leng = strands[k].length();
			}	
		}
		return place;
	}


}

//counts num of occurances

//compares lengths or ones with the same number of occurances
//returns strand
//if count from charCounter = 0 then return ''