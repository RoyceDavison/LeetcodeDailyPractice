//Aug 30 2018
public class PalindromeLinkedList {
	private static class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	
	 public static ListNode reverse(ListNode head) {
		 ListNode newHead = null;
		 while(head!=null){
			ListNode newNode = head.next;
			head.next = newHead;
			newHead = head;
			head = newNode;
		 }
		 return newHead;
	 }
	 //Algorithm from --> https://www.youtube.com/watch?v=oZuR2-AKkXE
	 public static boolean isPalindrome_1(ListNode head) {
	    if(head == null||head.next == null) return true;
		ListNode fast = head;
		ListNode slow = head;
		ListNode secondList = null;
		while(true) {
			fast = fast.next.next;		
			//the even numbers of nodes
			if(fast == null) {
				secondList = slow.next;
				slow = null;
				break;
			}
			//the odd numbers of nodes
			if(fast.next == null) {
				secondList = slow.next.next;
				slow = null;
				break;
			}
				slow = slow.next;
		}
		ListNode head_1 = head;
		ListNode head_2 = reverse(secondList);
		
		while(head_1!=null && head_2!=null) {
			if(head_1.val!=head_2.val) return false;
			else {
				head_1 = head_1.next;
				head_2 = head_2.next;
			}
		}
		return true; 
	 }
	 
	 public boolean isPalindrome_2(ListNode head) {
	        if(head == null) return true;
	        ListNode curr = head;
	        ListNode newHead = new ListNode(head.val);
	        while((head.next) != null){
	            head = head.next;
	            ListNode newNode = new ListNode(head.val);
	            newNode.next = newHead;
	            newHead = newNode;
	        }
	        ListNode new_curr = newHead;
	        while(new_curr!=null){
	            if(new_curr.val != curr.val) return false;
	            if(curr.next == null && new_curr.next != null) return false;
	            if(curr.next != null && new_curr.next == null) return false;
	            curr = curr.next;
	            new_curr = new_curr.next;
	        }
	        return true;
	    }
	 
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
			ListNode head = new ListNode(2);
			head.next = new ListNode(2);
			head.next.next = new ListNode(1);
			//head.next.next.next = new ListNode(9);
			ListNode curr_print = head;
			
			System.out.println(isPalindrome_1(head));
	 }
}