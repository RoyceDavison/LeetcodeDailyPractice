//Aug 30 2018
//理解Recursive way: https://leetcode.com/problems/reverse-linked-list/solution/
public class ReverseLinkedList {
	private static class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	
	//创建新的node把原来老的linkedlist的val附上去
	//NewNode.AddFirst() 并同时更新原来老的linkedlist head = head.next
	public static ListNode reverseList_myOwn(ListNode head) {
        if(head == null) return null;
        ListNode newHead = new ListNode(head.val);
        while((head.next)!=null){
            head = head.next;
            ListNode newNode = new ListNode(head.val);
            newNode.next = newHead;
            newHead = newNode; 
        }
        return newHead;
	}
	
	//答案是用新的node来存curr下一步要去的位置
	//prev就是新的linkedlist的head
	public static ListNode reverseList_solution1(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr!= null) {
        		ListNode nextCurr = curr.next;
        		curr.next = prev;
        		prev = curr;
        		curr = nextCurr;
        }    
        return prev;
	}
	
	public static ListNode reverseList_solution2(ListNode head) {
	        ListNode newHead = null;
	        while(head!= null) {
	        		ListNode newNode = head.next;
	        		head.next = newHead;
	        		newHead = head;
	        		head = newNode;
	        }    
	        return newHead;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
