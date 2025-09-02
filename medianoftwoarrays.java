//https://leetcode.com/problems/median-of-two-sorted-arrays/description/
//doing my third leetcode problem

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int mergedArrayLength = nums1.length + nums2.length;
        int[] merged = new int[mergedArrayLength];

        for (int i = 0; i < nums1.length; i++) {
            merged[i] = nums1[i];
        }

        for (int j = 0; j < nums2.length; j++) {
            merged[nums1.length + j] = nums2[j];
        }

        // Bubble sort
        for (int k = 0; k < merged.length - 1; k++) {
            for (int l = 0; l < merged.length - k - 1; l++) {
                if (merged[l] > merged[l + 1]) {
                    int temp = merged[l];
                    merged[l] = merged[l + 1];
                    merged[l + 1] = temp;
                }
            }
        }

        // Median calculation
        int mid = merged.length / 2;
        if (merged.length % 2 == 0) {
            return (merged[mid - 1] + merged[mid]) / 2.0;
        } else {
            return merged[mid];
        }
    }
}
