import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        String digit = "";
        for(int i=0;i<n;i++){
            digit+=digits[i];
        }
        BigInteger num = new BigInteger(digit);
        BigInteger res = num.add(BigInteger.ONE);
        String num2 = String.valueOf(res);

        int ans[] = new int[num2.length()];
        for(int i=0;i<num2.length();i++){
            ans[i] = num2.charAt(i)-'0';
        }
        return ans;
        
    }
}