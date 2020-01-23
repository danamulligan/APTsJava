//import java.util.*;
public class PrefixCode { 
      public String isOne(String[] words) {
          // fill in body of this function
    	  for(int k=0; k<words.length; k++) 
    	  {
    		  String prefix = words[k];
    		  for(String s : words) 
    		  {
    			 
    			  if(s.length()>=prefix.length()) 
    			  {
    				  if(!prefix.equals(s) && s.substring(0, prefix.length()).equals(prefix)) 
    				  {
    					  return "No, " + k;
    				  }
    			  }
    		  }
    	  }
    	  return "Yes";
      }
   }