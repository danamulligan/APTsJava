
 public class RemoveLast {
      public ListNode remove(ListNode list) {
          // replace statement below with code you write
    	  ListNode head = list;
    	  
    	  if(list == null || list.next == null)
    	  {
    		  return null;
    	  }
    	  while(list.next != null) {
    		  if(list.next.next == null)
    		  {
    			  list.next = null;
    		  }
    		  else
    		  {
    			  list = list.next;
    		  }
    	  }

          return head;
      }
  }