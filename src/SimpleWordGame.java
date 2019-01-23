public class SimpleWordGame {
      public int points(String[] player, String[] dictionary) 
      {
          // you write code here
    	  
    	  String remember = "";
    	  String known = "";
    	  int len = 0;
    	  int tot = 0;
    	  
    	  //this isn't going to work if player says the same thing twice
    	  //System.out.print("player: ");
		  //System.out.println(player);
		  //System.out.print("dictionary: ");
		  //System.out.println(dictionary);
		  
    	  for (int k=0; k<player.length; k++) 
    	  {
    		  for (int r=0; r<dictionary.length; r++) 
    		  {
    			  /*System.out.print("player[k]: ");
    			  System.out.println(player[k]);
    			  System.out.print("dictionary[r]: ");
    			  System.out.println(dictionary[r]);
    			  
    			  System.out.print("remember1 : ");
    			  System.out.println(remember);
    			  */
    			  
    			  if (player[k].equals(dictionary[r]) && !isInside(remember, player[k])) 
    			  {
    				  len = player[k].length();
    				  tot += len*len;
    				  remember = remember + player[k] + " ";
    				  //System.out.print("total: ");
    				  //System.out.println(tot);
    			  }
    			  
    			  
    			  //System.out.print("remember (this is the word we just tested): ");
    			  //System.out.println(remember);
    			  //System.out.println("");
    		  }
    	  }
    	  return tot;
      }
      
      private boolean isInside(String rem, String playerk) 
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

//how about you remove words that the player remembers, or concatenate words that don't exist in the dictionary? 
//no ok so concatinate word that DO exist and then NO NVM

//PROBLEM: remember only remembers one word
//if it's not the last word that was checked then it forgets that it already got points for it
//find if you can remove a string from string[] dictionary and take out a word if the player remembers it 


 