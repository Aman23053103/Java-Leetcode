import java.util.*;
class Solution{
  public int maxLen(int[] nums){
    HashMap<Integer,Integer> map=new HashMap<>();
    int sum=0;
    int maxLen=0;
    for(int i=0;i<nums.length;i++){
      sum+=nums[i];
      if(sum==0){
        maxLen=i+1;
      }
      if(map.containsKey(sum)){
        maxLen=Math.max(maxLen,i-map.get(sum));
      }else{
        map.put(sum,i);
      }
    }
    return maxLen;
  }
}

