//https://leetcode.com/problems/palindrome-number/description/
//done my second leetcode problem

class Solution {
    public boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        String reverseNum = "";

        int i = 0;

        for(i = number.length()-1; i >= 0; i --){
            reverseNum += number.charAt(i);
        }

        if(number != null && number.equals(reverseNum)){
            return true;
        } else{
            return false;
        }

    }
}