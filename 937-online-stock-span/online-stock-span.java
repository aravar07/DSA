class StockSpanner {

    class Pair{
        int val;
        int index;
        Pair(int val, int index){
            this.val=val;
            this.index = index;
        }
    }
    Stack<Pair> stack= new Stack<>();
    int i=0;
    
    public int next(int price) {
        while(!stack.isEmpty() && stack.peek().val <=price){
            stack.pop();
        }
        int span;
        if(stack.isEmpty()){
            span=i+1;
        }
        else{
            span = i-stack.peek().index;
        }
        stack.push(new Pair(price,i));
        i++;

        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */