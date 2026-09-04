class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int start =0;
        int maxLen = 0;
        for(int m=0;m<n;m++){
            int i=m;
            int j=m;
            while(i>=0 && j<n && s.charAt(i)==s.charAt(j)){
                if(j-i+1>maxLen){
                    maxLen=j-i+1;
                    start=i;
                }
                i--;
                j++;
            }
            i=m;
            j=m+1;
            while(i>=0 && j<n && s.charAt(i)==s.charAt(j)){
                if(j-i+1>maxLen){
                    maxLen = j-i+1;
                    start=i;
                }
                i--;
                j++;
            }
        }
        return s.substring(start,start+maxLen);
        

        
    }
}