//https://leetcode.com/problems/two-sum/description/
//doing my first leetcode problem

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int num1 = 0;
        int num2 = 0;
        int finalnum1 = 0;
        int finalnum2 = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                num1 = nums[i];
                num2 = nums[j];

            if((num1 + num2) == target && (i != j)){
                finalnum1 = i;
                finalnum2 = j;
            }
            }
        }

        int[] index = new int[2];
        index[0] = finalnum2;
        index[1] = finalnum1;

        return index;
    }
}