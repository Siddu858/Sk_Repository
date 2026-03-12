         class Solution {
    public int thirdMax(int[] nums) {
        long v1=nums[0],v2=Long.MIN_VALUE,v3=Long.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>v1 && nums[i]>v2 && nums[i]>v3){
                v3=v2;
                v2=v1;
                v1=nums[i];
            }else if(nums[i]>v2 && nums[i]>v3 && nums[i]<v1){
                v3=v2;
                v2=nums[i];
            }else if(nums[i]>v3 && nums[i]<v2 && nums[i]<v1){
                v3=nums[i];
            }
        }
        if(v3==Long.MIN_VALUE){
            long max=nums[0];
            for(int i=1;i<nums.length;i++){
                if(nums[i]>max) max=nums[i];
            }
            return (int)max;
        }
        return (int)v3;
    }
}
