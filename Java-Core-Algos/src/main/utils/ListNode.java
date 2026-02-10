package main.utils;

public class ListNode {
	public int val;
	public ListNode next;
	public ListNode() {}
	public ListNode(int val) { this.val = val; }
	public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	public static ListNode createLinkedList(int[] list) {
		ListNode result = new ListNode(-1);
		ListNode current = result;
		
		for (int i = 0; i < list.length; i++) {
			ListNode newNode = new ListNode(list[i]);
			current.next = newNode;
			current = current.next;
		}
		
		return result.next;
	}
	
	public static void printLinkedList(ListNode head) {
		ListNode current = head;
		
		while (current != null) {
			System.out.print(current.val + " -> ");
			current = current.next;
		}
		
		System.out.print("Null\n");
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    ListNode other = (ListNode) obj;
	    ListNode currentA = this;
	    ListNode currentB = other;
	    
	    while (currentA != null && currentB != null) {
	        if (currentA.val != currentB.val) return false;
	        currentA = currentA.next;
	        currentB = currentB.next;
	    }
	    
	    return currentA == null && currentB == null;
	}
	
	@Override
	public int hashCode() {
	    int hash = 1;
	    ListNode current = this;
	    while (current != null) {
	        hash = 31 * hash + current.val;
	        current = current.next;
	    }
	    return hash;
	}
}
