
public class ListLastFirst {
	public ListNode move(ListNode list) {
		// replace statement below with code you write
		ListNode front = list;
		
		
		if(list == null || list.next == null)
			return list;
		while(list.next.next != null) {
			list = list.next;
			
		}
		if(list.next.next == null)
		{
			list.next.next = front;
			front = list.next;
			list.next = null;
		}
		return front;
	}
}