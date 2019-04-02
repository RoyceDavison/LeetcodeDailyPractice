import java.util.HashSet;
import java.util.Set;
//Aug 31 2018
public class IntersectionofTwoLinkedLists {
	private static class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	
	//超时
	public static ListNode getIntersectionNode_BF(ListNode headA, ListNode headB) {
        ListNode curr_A = headA;
        ListNode curr_B = headB;
        while(curr_A!=null) {
        		if(curr_B == curr_A) {
        			return curr_A;
        		}
        		ListNode newNode = curr_B;
        		while(newNode!=null) {
        			if(newNode == curr_A)
        				return newNode;
        			else
        				newNode = newNode.next;
        				
        		}
        		curr_A = curr_A.next;
        }
        return null;
	}
	public static ListNode getIntersectionNode_HashSet(ListNode headA, ListNode headB) {
		Set<ListNode> addressSeen = new HashSet<>();
		ListNode curr_A = headA;
		ListNode curr_B = headB;
		while(curr_A!=null) {
			addressSeen.add(curr_A);
		}
		while(curr_B != null) {
			if(!addressSeen.contains(curr_B))
				addressSeen.add(curr_B);
			else {
				return curr_B;
			}
		}
		return null;
	}
	//两种方法: 1.len 2.非len
	//https://www.youtube.com/watch?v=_7byKXAhxyM
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	    if(headA == null || headB == null) return null;
		ListNode A = headA;
		ListNode B = headB;
		//a == null && b == null 如果两者都没有交接处
		// A = A == null? headB: A.next; 
		// B = B == null? headA:B.next;
		while(A!=B) {
			if(A!=null) {
				A = A.next;
			}
			else {
				A = headB;
			}
			if(B!=null) {
				B = B.next;
			}
			else {
				B = headA;
			}
		}
		return A;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode headA = new ListNode(2);
		headA.next = new ListNode(3);
		ListNode headB = headA.next;
		System.out.println(getIntersectionNode_BF(headA,headB));
	}

}
