//Two Pointer Approach
public static boolean pairSum1(ArrayList<Integer> list,int target){
        int lp=0;
        int rp=list.size()-1;
        while(lp<rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }else if(list.get(lp)+list.get(rp)<target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }
