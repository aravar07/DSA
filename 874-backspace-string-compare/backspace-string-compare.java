class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stackA = new Stack<>();
        Stack<Character> stackB = new Stack<>();

        for(char ch1: s.toCharArray()){
            if(ch1=='#'){
                if(!stackA.isEmpty()){
                    stackA.pop();
                }
                
            }
            else{
                stackA.push(ch1);
            }
        }

        for(char ch2: t.toCharArray()){
            if(ch2=='#'){
                if(!stackB.isEmpty()){
                    stackB.pop();
                }
                
            }
            else{
                stackB.push(ch2);
            }
        }

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        for(char ch1: stackA){
            sb1.append(ch1);
        }
        String resA = sb1.toString();
        for(char ch2: stackB){
            sb2.append(ch2);
        }
        String resB = sb2.toString();

        if(resA.equals(resB)){
            return true;
        }
        else{
            return false;
        }
    }
}