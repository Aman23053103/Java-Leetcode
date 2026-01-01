class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int[] count1=new int[26];
        int[] count2=new int[26];
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            count1[c-'a']++;
        }
        int windsize=s1.length();
        for(int i=0;i<s2.length();i++){
            count2[s2.charAt(i)-'a']++;
            if(i>=windsize){
                count2[s2.charAt(i-windsize)-'a']--;
            }
            if(arraysEqual(count1,count2)){
                return true;
            }
        }
        return false;
    }
    private boolean arraysEqual(int[] a,int[] b){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}
