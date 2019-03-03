import java.util.*;

public class IsomorphicWords {
      public int countPairs(String[] words) {
         // fill in code here
    	int count = 0;
    	for(int k=0; k<words.length; k++) {
    		for(int i=k+1;i<words.length;i++)
    		{
    			if(k!=i) {
    				count += iso(words[k], words[i]);
    			}
    		}
    	}
    	return count;
      
      }

      public int iso(String a, String b) {
    	  //String[] alpha = "abcdefghijklmnopqrstuvwxyz".split(""); // a=0 z=25
    	  //System.out.println("a: "+a+", b: "+b);
    	  //StringBuilder key = new StringBuilder();
    	  
    	  String[] x = a.split("");
    	  String[] y = b.split(""); 
    	  HashMap<String, String> pairs = new HashMap<>();
    	  HashSet<String> letters = new HashSet<>();

    	  for(int k=0; k<x.length; k++) {
    		  String key = x[k];
    		  String value = y[k];

    		  if(!pairs.containsKey(key) && pairs.containsValue(value))
    		  {
    			  return 0;
    		  }
    		  if(pairs.containsKey(key) && !pairs.containsValue(value))
    		  {
    			  return 0;
    		  }
    		  if(pairs.containsKey(key)) 
    		  {
    			  if(!pairs.get(key).equals(value))
    			  {
    				  return 0;
    			  }
    		  }
    		  if(!pairs.containsKey(key) && !pairs.containsValue(value))
    		  {
    			  pairs.put(key, value);
    		  }  
    	  }
    	  return 1;
      }
      public static void main(String[] args) 
      {
    	  IsomorphicWords o = new IsomorphicWords();
    	  //define params
    	  String[] words = {"aa", "ab", "bb", "cc", "cd"};
    	  int result = o.countPairs(words);
    	  System.out.println("\n"+result);
  	}
   }

