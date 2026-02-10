package test.twopointer;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import main.twopointer.twopointer;

import main.utils.*;

class twopointerTest {

	@Test
	void twopointtest() {
		System.out.println("----Two Pointer----");
		int[] num1 = {2,5,7};
		int m = num1.length;
		int[] num2 = {3,5,9};
		int n = num2.length;
		int[] nums1 = new int[m+n];
		for(int i=0; i<m+n; i++) {
			if(i<m) {
				nums1[i] = num1[i];
			} else {
				nums1[i] = 0;
			}
		}
		
		int[] result = twopointer.mergeTwoSortedArrays(nums1, m, num2, n);
		int[] expect = {2, 3, 5, 5, 7, 9};
		System.out.println("Two Pointer: "+Arrays.toString(result));
		System.out.println("Two Pointer Expected: "+Arrays.toString(expect));
		assertArrayEquals(expect,result);
	}
	
	@Test
	void twopointEmptyTest() {
		System.out.println("----Empty Two Pointer----");
		int[] nums1 = {1};
		int m = nums1.length;
		int[] nums2 = new int[0];
		int n = nums2.length;
		
		int[] result = twopointer.mergeTwoSortedArrays(nums1, m, nums2, n);
		int[] expect = {1};
		System.out.println("Two Pointer: "+Arrays.toString(result));
		System.out.println("Two Pointer Expected: "+Arrays.toString(expect));
		assertArrayEquals(expect,result);		
	}

	@Test
	void twopointListTest() {
		System.out.println("----Two Pointer List----");
		int[] list1Array = {1,2,4};
		ListNode list1 =  ListNode.createLinkedList(list1Array);
				// new ListNode(1,new ListNode(2,new ListNode(4, null)));
		int[] list2Array = {1,3,4};
		ListNode list2 = ListNode.createLinkedList(list2Array);
				// new ListNode(1,new ListNode(3,new ListNode(4, null)));
		
		int[] resultList = {1,1,2,3,4,4};
		
		ListNode expect = ListNode.createLinkedList(resultList);
		ListNode result = twopointer.mergeTwoSortedLinkedList(list1, list2);
		System.out.println("Two Pointer Result: ");
		ListNode.printLinkedList(result);
		System.out.println("Two Pointer Expected: ");
		ListNode.printLinkedList(expect);
		assertTrue(expect.equals(result));
		
	}
}
