public class sortList {

	public static class ListNode {
		     int val;
		     ListNode next;
		     ListNode(int x) { val = x; }
	}
	
	public static ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        //cut the list to two halves
        ListNode prev = null, slow = head, fast = head;
        
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;
        
        //sort each half
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
            
        //merge l1 and l2
        return merge(l1,l2);
    }
    
    public static ListNode merge(ListNode l1, ListNode l2){
        ListNode l = new ListNode(0);
        ListNode p = l;
        
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                p.next = l1;
                l1 = l1.next;
            }
            else{
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        
        if(l1!=null){
            p.next = l1;
        }
        
        if(l2!=null){
            p.next = l2;
        }
        
        return l.next;
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(4);
		head.next = new ListNode(3);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(1);
	
		ListNode newhead = sortList(head);
		ListNode curr = newhead;
		while(curr!=null) {
			System.out.println(curr.val);
			curr = curr.next;
		}
	}

}
