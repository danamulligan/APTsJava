public class VoteRigging {
      public int minimumVotes(int[] votes) {
    	  int max = -1;
    	  int count = 0;
    	  int place = -1;
    	  for(int k=0; k<votes.length; k++) {
    		  if(votes[k] == max) {
    			  count++;
    		  }
    		  if(votes[k]>max) {
    			  max = votes[k];
    			  place = k;
    		  }  
    	  }
    	  if(max == votes[0] && count == 0)
    		  return 0;
    	  int[] newVotes = new int[votes.length];
    	  newVotes[0] = votes[0] + 1;
    	  for(int k=1; k<votes.length; k++) {
    		  if(place == k) {
    			  newVotes[k] = votes[k]-1;
    		  }
    		  else newVotes[k] = votes[k];
    	  }
    	  return 1 + minimumVotes(newVotes);
      }
}
