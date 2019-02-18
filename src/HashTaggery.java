
public class HashTaggery {
	public String maxTag(String[] tags, String[] messages) {
		// replace this code
		double count = 0.0;
		for(String m : messages)
		{
			if(hasATag(m, tags)){
				count += 1.0;
			}
		}
		
		if (count/messages.length>=0.75)
		{
			return "tagged";
		}

		return "missed";
	}
	public boolean hasATag(String message, String[] tags)
	{
		String[] words = message.split(" ");
		for(String m : words) 
		{
			for(String t : tags)
			{
				if(m.equals(t))
				{
					return true;
				}
			}
		}
		return false;
	}

}