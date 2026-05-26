import java.util.*;
public class Solution {
    static class Meeting{
        int start;
        int end;
        Meeting(int start,int end){
            this.start=start;
            this.end=end;
        }
    }
    public int maxMeeting(int start[],int end[],int n){
        ArrayList<Meeting> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new Meeting(start[i],end[i]));

        }
        Collections.sort(list,(a,b)->a.end-b.end);
        int count=1;
        int lastEnd=list.get(0).end;
        for(int i=1;i<n;i++){
            if(list.get(i).start>lastEnd){
                count++;
                lastEnd=list.get(i).end;
            }
        }
        return count;
    }
}
