package com.example.string;

// Q: Find Median of two Sorted Arrays of Different Sizes
// https://www.geeksforgeeks.org/median-two-sorted-arrays-different-sizes-ologminn-m/
public class MedianOfSortedArrays {

    public static void main(String[] args) {

        System.out.println("Median for the array is: " + getMedianSortedArray(
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{7, 7, 8, 11, 22, 33, 34, 35, 36}));
    }

    // Dynamic programming will take more time
    // Better to use binary search to solve
    public static int getMedianSortedArray(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return getMedianSortedArray(nums2, nums1);
        }

        int x = nums1.length;
        int y = nums2.length;

        int low = 0;
        int high = x;

        while (low <= high) {

            int partX = (low + high) / 2;
            int partY = (x + y + 1) / 2 - partX;

            int maxLeftX = (partX == 0) ? Integer.MIN_VALUE : nums1[partX - 1];
            int minRightX = (partX == x) ? Integer.MAX_VALUE : nums1[partX]; // taken everything from partition

            int maxLeftY = (partY == 0) ? Integer.MIN_VALUE : nums2[partY - 1];
            int minRightY = (partY == x) ? Integer.MAX_VALUE : nums2[partY];

            if (maxLeftX <= minRightY && maxLeftY < minRightX) {
                if ((x + y) % 2 == 0) {
                    return (Math.max(maxLeftY, maxLeftX) + Math.min(minRightX, minRightY)) / 2;
                } else return Math.max(maxLeftX, maxLeftY);
            } else if (maxLeftX > minRightY) {
                high = partX - 1;
            } else
                low = partX + 1;
        }
        return -1;
    }
}
