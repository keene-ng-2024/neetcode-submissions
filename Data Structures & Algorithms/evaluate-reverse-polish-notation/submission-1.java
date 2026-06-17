class Solution {
    public int evalRPN(String[] tokens) {
        //we need to implement stack!!
        Deque<String> stack = new ArrayDeque<>();

        for(String s : tokens){
            if(!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/") ){
                stack.push(s);
            }
            else{
                int second = Integer.parseInt(stack.pop());
                int first = Integer.parseInt(stack.pop());
                //first to the second;
                if(s.equals("+")){
                    stack.push(first + second+"");
                }
                else if(s.equals("-")){
                    stack.push(first - second + "");
                }
                else if(s.equals("/")){
                    stack.push(first / second + "");
                }
                else{
                    stack.push(first * second + "");
                }
            }
            
        }
        return Integer.parseInt(stack.pop());
        
    }
}
