/*
public class Anonymous {
      public int howMany(String[] headlines, String[] messages) {
            // fill in code here
    	  int count = 0;
    	  for (String m : messages) {
    		  if (canwrite(headlines, m))
    		  	{
    			  count++;
    		  	}
    	  }
    	  
          return count;
      }
      public boolean canwrite(String[] headlines, String message) {
		  int[] hList = countH(headlines);
		  int[] mList = countM(message);
    	  
    	  for(int k=0; k<256; k++) {
			  if(hList[k]<mList[k]) {
				  return false;
			  }
		  }
		  return true;
	  }
      public int[] countM(String message) {
    	  int[] mList = new int[256];
    	  message = message.toLowerCase();
    	  for(int k=0; k<message.length(); k++)
    	  {
    		  mList[message.charAt(k)] += 1;
    	  }
    	  return mList;
      }
      
      public int[] countH(String[] headlines)
      {
    	  int[] hList = new int[256];
    	  String hold = "";
    	  
    	  for(String s : headlines)
    	  {
    		  hold = s.toLowerCase();
    		  for(int k=0; k<s.length(); k++)
    		  {
    			  hList[hold.charAt(k)] += 1; 
    		  }
    	  }
    	  return hList;
      }
   }
*/

public class Anonymous {
	public int howMany(String[] headlines, String[] messages) 
	{
		// fill in code here

		int count = 0;
		
		int[] countsH = countH(headlines);
		String alphabet = "abcdefghijklmnopqrstuvwxyz";

		for(int k=0; k<messages.length; k++) 
		{
			boolean valid = true;
			int[] countsM = countM(messages[k]);
			for(char ch : alphabet.toCharArray())
			{
				if(countsH[ch]<countsM[ch])
				{
					valid = false;
				}
			}
			if(valid)
				count++;
		}
		return count;
	}
	public int[] countH(String[] headlines)
	{
		int[] countsH = new int[256];
		for(String s : headlines)
		{
			for (char ch : s.toLowerCase().toCharArray())
			{
				if (ch != ' ')
				{
					countsH[ch] = countsH[ch] + 1;
				}
			}
		}
		return countsH;
	}
	public int[] countM(String s)
	{
		int[] countsM = new int[256];
		for (char ch : s.toLowerCase().toCharArray())
		{
			if (ch != ' ')
			{
				countsM[ch] = countsM[ch] + 1;
			}
		}

		return countsM;
	}
}
