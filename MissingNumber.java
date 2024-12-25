
// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

class Solution {
    public int missingNumber(int[] nums) {
        int length = nums.length;
        HashSet <Integer> set = new HashSet<>();
        for(int ele : nums )
            set.add(ele);
        for(int i = 0; i<=length ; i++){
            if (!(set.contains(i)))
                return i;
        }
        return -1;
    }
}
