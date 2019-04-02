
public class RemoveNthNodefromEnd {
	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
		}
	}
	
	//two passes
    public static ListNode removeNthFromEnd_1(ListNode head, int n) {
    	ListNode dummy = new ListNode(0);
    	dummy.next = head;
    	ListNode curr = head;
    	int length = 0;
    	
    	while(curr!=null) {
    		length ++;
    		curr = curr.next;
    	}
    	
    	length -= n;
    	curr = dummy;
    	while(length > 0) {
    		length --;
    		curr = curr.next;
    	}
    	curr.next = curr.next.next;
    	return dummy.next;
    }
    
    //one pass
    public static ListNode removeNthFromEnd_2(ListNode head, int n) {
    	ListNode dummy = new ListNode(0);
    	dummy.next = head;
    	ListNode first = dummy;
    	ListNode second = dummy;
    	
    	//gap b.w first and second --> n nodes apart
    	for(int i = 1; i <= n+1;i++) {
    		first = first.next;
    	}
    	
    	while(first!=null) {
    		first = first.next;
    		second = second.next;
    	}
    	second.next = second.next.next;
    	return dummy.next;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		
		head = removeNthFromEnd_2(head,2);
		ListNode c = head;
		while(c!=null) {
			System.out.println(c.val);
			c = c.next;
		}
	}

}
