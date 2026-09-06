class Solution {
    public int value(char c){
        if(c=='1'){
            return 1;
        }
        return 0;
    }
    public String addBinary(String a, String b) {
        int n1 = a.length();
        int n2 = b.length();
        int i=n1-1;
        int j=n2-1;
        StringBuilder res = new StringBuilder();

        int carry=0;
        while(i>=0||j>=0||carry>0){
            int bitA = 0;
            int bitB = 0;
            if(i>=0){
                bitA=value(a.charAt(i));
            }
            if(j>=0){
                bitB=value(b.charAt(j));
            }
            int sum = bitA + bitB + carry;
            int bit = sum%2;
            carry=sum/2;
            res.append(bit);

            i--;
            j--;
        }
        return res.reverse().toString();
    }
}