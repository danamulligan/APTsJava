import java.util.HashSet;

public class BigWord {
      public String most(String[] sentences) {
          // you write code here
    	  //String joined = sentences.toString();
    	  //System.out.println(joined);
    	  //System.out.println("");
    	  
    	  String joined = "";
    	  
    	  for(int k=0; k<sentences.length; k++)
    	  {
    		  joined = joined + sentences[k] + " ";
    	  }
    	  // System.out.println("joined: " + joined);
    	  HashSet<String> dict = new HashSet<>();
    	  String[] words = joined.split(" ");
    	  // System.out.println("words: " + words);
    	  
    	  for(int k=0; k<words.length; k++)
    	  {
    		  dict.add(words[k].toLowerCase());
    	  }
    	  
    	  int last = 0;
    	  int count = 0;
    	  String holder = "";
    	  String lower = "";
    	  
    	  for(String s : dict)
    	  {
    		  for(int k=0; k<words.length; k++)
    		  {
    			  lower = words[k].toLowerCase();
    			  if (lower.contentEquals(s)) {
    				  count++;
    			  }
    		  }
    		  if (count>last)
    		  {
    			  last = count;
    			  holder = s;
    			  // System.out.println("inside: "+s);
    		  }
    		  count = 0;
			 // System.out.println("outside: " + s);
			 // System.out.println("count: "+count);
			 // System.out.println("last: " +last);

    	  }
    	  // System.out.println(" ");
    	  return holder;
      }
  }