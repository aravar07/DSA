class Solution {
    int i=0;

    public String decodeString(String s) {
       return decode(s); 
    }
    public String decode(String s){
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        while(i<n && s.charAt(i)!=']'){
            char ch = s.charAt(i);

            if(Character.isLetter(ch)){
                sb.append(ch);
                i++;
            }
            else if(Character.isDigit(ch)){
                int num = 0;
                while(i<n && Character.isDigit(s.charAt(i))){
                    num = num*10 + (s.charAt(i)-'0');
                    i++;
                }
                i++;
                String inside = decode(s);
                i++;
                for(int j=0;j<num;j++){
                    sb.append(inside);
                }
            }
            
        }
        return sb.toString();
    }
}