//Aug.30.2018
public class DeleteNodeinaLinkedList {
	private static class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	
	public static void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(4);
		head.next = new ListNode(5);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(9);
		ListNode curr_print = head;
		
		deleteNode(head.next);
		System.out.println("4519");
		while(curr_print!= null) {
			System.out.print(curr_print.val);
			curr_print = curr_print.next;
		}
	}

}
