class Solution {
    public boolean canMake(int[] bloomDay,int m,int k,int mid){
        int flowers=0;
        int bouquets=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                flowers++;
            }else{
                flowers=0;
            }
            if(flowers==k){
                bouquets++;
                flowers=0;
            }
        }
        return bouquets>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length){
            return -1;
        }
        int left=0;
        int right=0;
        for(int i=0;i<bloomDay.length;i++){
            left=Math.min(left,bloomDay[i]);
            right=Math.max(right,bloomDay[i]);
        }
        while(left<right){
            int mid=left+(right-left)/2;
            if(canMake(bloomDay,m,k,mid)){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}
