package main.Searching;

public class binarysearch {

  public static int binarysearchImplementation(int[] nums1, int m){
    // Find a int in a sorted array

    // Higher point
    int pntR = nums1.length -1;

    // Lower point
    int pntL = 0;

    while(pntL < pntR){
      int pntM = pntL +((pntR - pntL) / 2);
      // Base case
      if (nums1[pntM] == m){
        return pntM;
      }
      // If the value is greater than the midpoint
      // move the left point to the midpoint
      else if (m > nums1[pntM]) {
        // Move past the midpoint so that it doesnt get stuck
        // if array is between 1-2 then print
        pntL = pntM + 1;
      }
      // If the value is less than the midpoint 
      // move the right pointer to the midpoint
      else {
        pntR = pntM +1;
      }
    }
    return -1;
  }

  public static void main(String args[]) {
    int arr[] = { 2, 3, 4, 10, 40 };
    int x = 3;
    int result = binarysearchImplementation(arr, x);
    if (result == -1)
        System.out.println(
            "Element is not present in array");
    else
        System.out.println("Element is present at "
                            + "index " + result);
  }
  
}
