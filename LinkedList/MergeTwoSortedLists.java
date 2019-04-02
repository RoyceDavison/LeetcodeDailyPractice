//Aug 30 2018 第二次
public class MergeTwoSortedLists {
	private static class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	
    	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    		if(l1 == null && l2 == null) return null;
    		if(l1 == null) return l2;
    		if(l2 == null) return l1;
    		
    		ListNode newHead = new ListNode(-1);
    		ListNode curr = newHead;
    		while(l1!=null && l2!=null) {
    			if(l1.val <= l2.val) {
    				curr.next = l1;
    				l1 = l1.next;
    			}
    			else {
    				curr.next = l2;
    				l2 = l2.next;
    			}
    			curr = curr.next;
    		}
    		
    		if(l1 == null) {
    			curr.next = l2;
    		}
    		
    		if(l2 == null) {
    			curr.next = l1;
    		}
    		return newHead.next;
    	}
}
