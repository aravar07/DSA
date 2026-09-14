class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] nge = new int[n];
        for(int i=n-1;i>=0;i--){
            stack.push(nums[i]);
        }
    

        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && nums[i]>=stack.peek()){
                stack.pop();
         
            }
            if(stack.isEmpty()){
                nge[i]=-1;
            }
            else{
                nge[i]=stack.peek();
            }
            stack.push(nums[i]);
        }
        return nge;
    }
}