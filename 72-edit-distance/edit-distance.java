class Solution {
    public int minDistance(String word1, String word2) {
       int n1=word1.length();
       int n2=word2.length();
       int[][] seq = new int[n1+1][n2+1];

       for(int i=0;i<=n1;i++){
            seq[i][0] = i;
       }
       for(int j=0;j<=n2;j++){
            seq[0][j]=j;
       }
       for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    seq[i][j]=seq[i-1][j-1];
                }
                else{
                    seq[i][j]=1+Math.min(seq[i-1][j-1],Math.min(seq[i-1][j],seq[i][j-1]));
                }
            }
       }
       return seq[n1][n2];
        
    }
}