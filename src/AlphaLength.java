import java.util.TreeMap;

public class AlphaLength {
      public ListNode create (String[] words) {
    	  TreeMap<String, Integer> map = new TreeMap<>();
    	  for(String s : words) {
    		  map.putIfAbsent(s, s.length());
    	  }
    	  
    	  if(map.size()==1) {
    		  return new ListNode(words[0].length());
    	  }
    	  
    	  ListNode front = new ListNode(0, null);
    	  ListNode list = front;
    	  ListNode hold = front;
    	  int counter = 0;
    	  for(String s : map.keySet()) {
    		  if(counter == 0) {
    			  front = new ListNode(map.get(s));
    			  list = front;
    			  list.next = hold;
    			  list = list.next;
    			  counter++;
    		  }
    		  else if(counter+1 < map.size()) {
    			  list.info = map.get(s);
    			  hold = new ListNode(0, null);
    			  list.next = hold;
    			  list = list.next;
    			  counter++;
    		  }
    		  else {
    			  list.info = map.get(s);
    			  list.next = null;
    		  }
    	  }
    	  
	  return front;
      }
      
      
  }