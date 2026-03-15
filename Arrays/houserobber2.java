class Solution {
    public int rob(int[] nums) {
        int n=nums.length,i;
        if(n<=1) return nums[0];
        if(n==2){
            return Math.max(nums[0],nums[1]);
        }
        return Math.max(helper(nums, 0, n-2), helper(nums, 1, n-1));
    }
    public int helper(int[] nums, int start, int end){
        int prev2 = 0;
        int prev1 = 0;

        for(int i = start; i <= end; i++){
            int curr = Math.max(prev1, nums[i] + prev2);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}
