class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>threshold || nums[i]%2!=0){
                continue;
            }
            int len=1;
            for(int j=i+1;j<n;j++){
                if(nums[j]>threshold || nums[j]%2==nums[j-1]%2){
                    break;
                }
                len++;
            }
            ans=Math.max(ans,len);
        }
        return ans;
        
    }
}
