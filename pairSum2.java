 public static boolean pairsum2(ArrayList<Integer> list, int target){
        int bp=-1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp=bp+1; // smallest
        int rp=bp;   // largest
        while(lp!=rp){
            //case found
            if(list.get(lp)+list.get(rp)==target){
                return true;
                // move both pointers
                //case less than target
            }else if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%list.size();
            }else{
                //case greater than target 
                rp=(list.size()+rp-1)%list.size();
            }
        }
        return false;
    }
