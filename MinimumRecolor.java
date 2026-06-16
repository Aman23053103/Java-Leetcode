class Solution {
    public int minimumRecolors(String blocks, int k) {
       int whitecolor=0;
       for(int i=0;i<k;i++){
        if(blocks.charAt(i)=='W'){
            whitecolor++;
        }
       } 
       int ans=whitecolor;
       for(int i=k;i<blocks.length();i++){
        if(blocks.charAt(i-k)=='W'){
            whitecolor--;
        }
        if(blocks.charAt(i)=='W'){
            whitecolor++;
        }
        ans=Math.min(ans,whitecolor);
       }
       return ans;
    }
}
