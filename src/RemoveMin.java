
public class RemoveMin {
      public ListNode remove (ListNode list) 
      {
    	  ListNode front = list;
    	  int minBefore = findMin(list);
    	  if(list.next == null)
    		  return null;
    	  if(list.info == minBefore)
    	  {
    		  front = list.next;
    	  }
    	  while(list.next != null)
    	  {
    		  if(list.next.info == minBefore)
    		  {
    			  list.next = list.next.next;
    			  return front;
    		  }
    		  else
    		  {
    			  list = list.next;
    		  }
    	  }

    	  return front;
      }
      public int findMin(ListNode list)
      {
    	  int min = list.info;
    	  while(list != null) 
    	  {
    		  if(min > list.info) {
    			  min = list.info;
    			  
    		  }
    		  list = list.next;
    	  }
    	  return min;
      }
}