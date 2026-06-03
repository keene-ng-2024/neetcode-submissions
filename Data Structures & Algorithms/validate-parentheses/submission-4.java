class Solution {
    public boolean isValid(String s) {
        Stack<Character> opener = new Stack<>();
        //Stack<Character> closer = new Stack<>();
        //every open bracket is closed by the same type of close bracket
        //closed in the correct order, and the correct type
        HashMap<Character, Character> mapping = new HashMap<>();
        mapping.put(')', '(');
        mapping.put('}', '{');
        mapping.put(']','[');

        char[] items = s.toCharArray();
        for(char item : items){
            if(item == '(' ||item == '{' || item == '[' ){
                opener.push(item);
            }
            else{
                if(mapping.containsKey(item) && opener.size() > 0){
                    if(opener.peek() != mapping.get(item)){
                        return false;
                    }
                    else{
                        opener.pop();
                    }
                }else{
                    return false;
                }

            }
            
        }
        if(opener.size() > 0){
            return false;
        }

        return true;

        
    }
}
