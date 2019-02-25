
public class DoubleList {
      public ListNode bigify(ListNode list) {
          // replace statement below with code you write
    	  ListNode front = list;
    	  
    	  while(list != null)
    	  {
    		  list.next = new ListNode(list.info, list.next);
    		  list = list.next.next;
    	  }
    	  
          return front;
      }
  }
