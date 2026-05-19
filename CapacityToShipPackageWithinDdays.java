class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int mincap=0;
        int maxcap=0;
        for(int i=0;i<weights.length;i++){
            mincap=Math.max(mincap,weights[i]);
            maxcap+=weights[i];
        }
        while(mincap<maxcap){
            int mid=mincap+(maxcap-mincap)/2;
            int day=1;
            int sum=0;
            for(int i=0;i<weights.length;i++){
                if(sum+weights[i]>mid){
                    day++;
                    sum=0;
                }
                sum+=weights[i];
            }
            if(day>days){
                mincap=mid+1;
            }else{
                maxcap=mid;
            }
        }
        return mincap;
    }
}
