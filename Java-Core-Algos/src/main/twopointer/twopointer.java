package main.twopointer;

import main.utils.*;

public class twopointer {
	
	public static int[] mergeTwoSortedArrays(int[] nums1, int m, int[] nums2, int n ) {
		// Merge 2 sorted arrays
		
		// Start from the back of the array
		int ptr1 = m - 1;
		int ptr2 = n - 1;
		int r = m + n - 1;
		
		// Out of bounds checks
		while(ptr1 > -1 && ptr2 >-1) {
			if(nums1[ptr1] >= nums2[ptr2]) {
				nums1[r] = nums1[ptr1];
				ptr1 --; 
			} else {
				nums1[r] = nums2[ptr2];
				ptr2 --;
			}
			r--;
		}
		
		return nums1;
	}
	
	public static ListNode mergeTwoSortedLinkedList(ListNode list1, ListNode list2) {
		// Current holds the memory location of result
		ListNode result = new ListNode(-1); // node to simplify edge cases
		ListNode currentNode = result;
		
		while (list1 != null && list2 != null) {
			if (list1.val <= list2.val) {
				currentNode.next = list1;
				list1 = list1.next; 
			} else {
				currentNode.next = list2;
				list2 = list2.next;
			}
			// Increment current node
			currentNode = currentNode.next;
		}
		
        // Append the remaining nodes
        currentNode.next = (list1 != null) ? list1 : list2;
				
		return result.next;
	}

}