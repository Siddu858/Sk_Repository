class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        if(nums.length<=1){
            if(target<nums[i]||target==nums[i])  return 0;
            
        }
        while(target>nums[i]&&i<nums.length-1){
            i++;
        }
        if(nums[i]<target){
            return i+1;
        }
        return i;
    } 
}