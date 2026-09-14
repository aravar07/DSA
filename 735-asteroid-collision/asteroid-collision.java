class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        int n = asteroids.length;
        for(int i=0;i<n;i++){
            if(asteroids[i]<0){
                boolean alive = true;
                while(!stack.isEmpty() && stack.peek()>=0){
                    if(Math.abs(asteroids[i])>stack.peek()){
                        stack.pop();
                    }
                    else if (Math.abs(asteroids[i])==stack.peek()){
                        stack.pop();
                        alive = false;
                        break;
                    }
                    else{
                        alive = false;
                        break;
                    }
                }
                if(alive){
                    stack.push(asteroids[i]);
                }
            }
            else{
                stack.push(asteroids[i]);
            }
        }
        int[] ans = new int[stack.size()];
        for(int i=0;i<stack.size();i++){
            ans[i]=stack.get(i);
        }
        return ans;

    }
}