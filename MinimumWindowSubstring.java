class Solution {
    public String minWindow(String s, String t) {
        int[] count = new int[128];
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            count[c]++;
        }
        int left=0;
        int start=0;
        int minLen=Integer.MAX_VALUE;
        int required=t.length();
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            if(count[c]>0){
                required--;
            }
            count[c]--;
            while(required==0){
                if(right-left+1<minLen){
                    minLen=right-left+1;
                    start=left;
                }
                char leftchar= s.charAt(left);
                count[leftchar]++;
                if(count[leftchar]>0){
                    required++;
                }
                left++;
            }
            }
            if(minLen==Integer.MAX_VALUE){
                return "";
           
        }
         return s.substring(start,start+minLen);
    }
}
