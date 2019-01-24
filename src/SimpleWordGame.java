public class SimpleWordGame {
      public int points(String[] player, String[] dictionary) 
      {  
    	  String remember = "";
    	  int len = 0;
    	  int tot = 0;
		  
    	  for (int k=0; k<player.length; k++) 
    	  {
    		  for (int r=0; r<dictionary.length; r++) 
    		  {
    			  if (player[k].equals(dictionary[r]) && !isInsideList(remember, player[k])) 
    			  {
    				  len = player[k].length();
    				  tot += len*len;
    				  remember = remember + player[k] + " ";
    			  }
    		  }
    	  }
    	  return tot;
      }
      
      private boolean isInsideList(String rem, String playerk) 
      {
    	  String[] remember = rem.split(" ");
    	  for (int k=0; k<remember.length; k++) 
    	  {
    		  if (remember[k].equals(playerk)) 
    		  {
    			  return true;
    		  }
    	  }
    	  return false;
      }
  }