class Solution{
  public List<integer> countDistinct(int[] nums,int k){
    List<Integer> result=new ArrayList<>();
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<nums.length;i++){
      map.put(nums[i],map.getOrDefault(nums[i],0)+1);
      if(i>=k-1){
        result.add(map.size());
        int left=nums[i-k+1];
        map.put(left,map.get(left)-1);
        if(map.get(left)==0){
          map.remove(left);
        }
      }
    }
    return result;
  }
}
