

public class MergeLists {
      public ListNode weave (ListNode a, ListNode b) {
          // replace statement below with code you write
    	  
    	  ListNode atrav = a.next;
    	  ListNode btrav = b.next;
    	  ListNode front = a;
    	  front.next = b;
    	  ListNode list = front.next;
    	  
    	  while(btrav!=null) {
    		  list.next = atrav;
    		  atrav = atrav.next;
    		  list = list.next;
    		  list.next = btrav;
    		  btrav = btrav.next;
    		  list = list.next;
    		  
    	  }
    	  
    	  /*
    	  while(btrav != null) {
    		  list.next = atrav.next;
    		  list = list.next;
    		  atrav = atrav.next;
    		  
    		  list.next = btrav.next;
    		  list = list.next;
    		  btrav = btrav.next;
    	  }
    	  list.next = null;
    	  */
    	  
	  return front;
      }
      
  }
