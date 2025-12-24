public int MinSizeSubArray(int target,int[] nums)
  int leftwin=0,sum=0,minwinsize=Integer_MAX.VALUE;
  for(int r=0;r<nums.lenth();r++){
    sum+=nums[r];
    while(sum>=target){
      minwinsize=Math.min(minwinsize,r-leftwin+1)
        sum-=nums[l]
        l++;
    }
  }
return (minwinsize==Integer_MAX.VALUE)? 0:minwinsize;
}
  
