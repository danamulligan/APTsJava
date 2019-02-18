import java.util.TreeSet;

public class SetAside {
	public String common(String[] list) {
		// replace this with your code
		//String[] words = listWords(list).split(" ");
		String[] words = alphabetize(listWords(list));
		String common = "";

		for(String s : words) {
			if(inAll(list, s))
			{
				common = common + s + ',';
			}
		}
		String[] hehe = common.split(",");
		String yay = combined(hehe);
		return yay;
	}
	//method checks to see if a word is in a string
	/*public boolean isIn(String list, String word) {
		if(list.contains(word))
		{
			return true;
		}
		return false;
	}*/
	//method checks to see if the word is in all of the strings
	public boolean inAll(String[] list, String word)
	{
		for(String s : list) {
			if(s.contains(word)==false)
			{
				return false;
			}
		}
		return true;
	}     
	public String listWords(String[] list)
	{
		String words = "";
		for(String s : list) {
			String[] individual = s.split(" ");
			for(String r : individual) {
				if(!words.contains(r))
				{
					words = words + r + " ";
				}
			}
		}
		return words;
	}
	public String[] alphabetize(String words) {
		String[] list = words.split(" ");
		TreeSet<String> alpha = new TreeSet<>();
		for(String s : list) {
			alpha.add(s);
		}
		
		String[] good = alpha.toArray(new String[0]);
		
		return good;
	}
	public String combined(String[] hehe) {
		String common = "";
		for(int k=0; k<hehe.length; k++)
		{
			if(k!=hehe.length-1) {
				common = common + hehe[k] + " ";
			}
			else {
				common += hehe[k];
			}
		}
		return common;
	}
}
