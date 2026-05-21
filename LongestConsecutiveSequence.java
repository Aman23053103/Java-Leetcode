class Solution {
    public int longestConsecutive(int[] nums) {
        int longestlength=0;
        HashMap<Integer,Boolean> exploredMap=new HashMap<>();
        for(int num : nums){
            exploredMap.put(num,false);
        }
        for(int num : nums){
            int currLength=1;
            int nextnum=num+1;
            while(exploredMap.containsKey(nextnum) && exploredMap.get(nextnum)==false){
                currLength++;
                exploredMap.put(nextnum,true);
                nextnum++;
            }
            int prevnum=num-1;
            while(exploredMap.containsKey(prevnum) && exploredMap.get(prevnum)==false){
                currLength++;
                exploredMap.put(prevnum,true);
                prevnum--;
            }
            longestlength=Math.max(longestlength,currLength);
        }
        return longestlength;
    }
}
