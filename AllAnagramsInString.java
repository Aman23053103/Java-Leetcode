class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result=new ArrayList<>();
        if(p.length()>s.length()){
            return result;
        }
        int[] countP=new int[26];
        int[] countS=new int[26];
        for(int i=0;i<p.length();i++){
            char c=p.charAt(i);
            countP[c-'a']++;
        }
        int left=0;
        int windowSize=p.length();
        for(int right=0;right<s.length();right++){
            countS[s.charAt(right)-'a']++;
            if(right-left+1>windowSize){
                countS[s.charAt(left)-'a']--;
                left++;
            }
            if(right-left+1==windowSize){
                if(arraysEqual(countP,countS)){
                    result.add(left);
                }
            }
        }
        return result;
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
