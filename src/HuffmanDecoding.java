import java.util.TreeMap;

public class HuffmanDecoding {
      public String decode(String archive, String[] dictionary) {
    	  TreeMap<String, Character> map = new TreeMap<>();
    	  Character hold = 'A';
    	  for(String s : dictionary) {
    		  map.put(s, hold);
    		  hold++;
    	  }
    	  
    	  int start = 0;
    	 int fin = 1;
    	  StringBuilder builder = new StringBuilder();
    	  
    	  while(fin<=archive.length())
    	  {
    		  String sub = archive.substring(start, fin);
    		  if(map.containsKey(sub)) {
    			  builder.append(map.get(sub));
    			  start = fin;
    		  }
    		  fin++;
    	  }
    	  
    	  return builder.toString();
            // fill in code here
      }
   }