class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int k=0;
        for(int j=0;j<n;j++){
            boolean b=false;
            for(int i=0;i<k;i++){
                if(nums[i]==nums[j]){
                    b=true;
                    break;

                }
            }
            if(!b){
                nums[k]=nums[j];
                k++;
            }
        }
        return k;
    }
}