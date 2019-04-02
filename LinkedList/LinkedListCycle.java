import java.util.HashSet;
import java.util.Set;
//Aug.30.2018  I && II 都在今日做了
// https://www.youtube.com/watch?v=zbozWoMgKW0
public class LinkedListCycle {
	private static class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	
	public static boolean hasCycle_I(ListNode head) {
		Set<ListNode> nodesSeen = new HashSet<>();
		while(head!=null) {
			if(!nodesSeen.contains(head)) {
				nodesSeen.add(head);
				head = head.next;
			}
			else {
				return true;
			}
		}
		return false;
	}
	//为何要在while里check head.next != null?
	/*
	 * 假设一个linkedlist只有一个元素, head.next --> null 但是head.next.next --> NullPointerException
	 */
	public static boolean hasCycle_Floyd_detect_algorithm(ListNode head) {
			ListNode slow = head;
			ListNode fast = head;
			while(slow!=null && fast!=null && fast.next!=null) {
				slow = slow.next;
				fast = fast.next.next;
				if(slow == fast) return true;
			}
			return false;
	}
	
	public ListNode detectCycle_II(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while(slow!=null && fast!=null && fast.next!=null) {
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow) {
				ListNode curr = head;
				while(curr!=fast) {
					curr = curr.next;
					fast = fast.next;
				}
				return curr;
			}
		}
        return null;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(4);
		//head.next = new ListNode(5);
		//head.next.next = new ListNode(1);
		//head.next.next.next = new ListNode(9);
		
		ListNode curr_print = head.next.next;	
		while(curr_print!= null) {
			System.out.print(curr_print.val);
			curr_print = curr_print.next;
		}
	}

}
