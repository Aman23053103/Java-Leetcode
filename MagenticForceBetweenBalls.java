class Solution {
    public boolean canPlaceBalls(int[] position,int m,int guess){
        int balls=1;
        int prevpos=position[0];
        for(int i=1;i<position.length;i++){
            if(position[i]-prevpos>=guess){
                balls++;
                prevpos=position[i];
            }
        }
        return balls>=m;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int left=1;
        int right=position[position.length-1]-position[0];
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(canPlaceBalls(position,m,mid)){
                ans=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return ans;
    }
}
