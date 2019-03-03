import java.util.*;
//this has a horrible runtime

public class Thesaurus {
      public String[] edit(String[] entry) {
          // TODO: fill in code here
    	  if(check(entry))
    	  {
    		  
    	  }
    	  
    	  
    	  return new String[0];
      }
      public String alphabetize(String[] words) {
    	  StringBuilder alpha = new StringBuilder();
    	  
    	  String happy = alpha.toString();
    	  return happy;
      }
      public boolean inAll(String[] entry, String word) {
    	  
    	  for(int k=0; k<entry.length; k++)
    	  {
    		  if(!entry[k].contains(word))
    		  {
    			  return false;
    		  }
    	  }
    	  return true;
      }
      public boolean check(String[] entry)
      {
    	  TreeSet<String> happy = new TreeSet<>();
    	  int count = 0; 
    	  for(int k=0; k<entry.length; k++)
    	  {
    		  String[] words = entry[k].split(" ");
    		  for(String word : words)
    		  {
    			  if(inAll(entry, word))
    			  {
    				  happy.add(word);
    				  count++;
    			  }
    		  }
    	  }
    	  if(happy.size()==count)
    	  {
    		  return true;
    	  }
    	  return false;
      }
  }