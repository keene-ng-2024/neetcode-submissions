class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> skibidi = new Stack<>();
        //so that specific day, how many more till it hits something
        //want to iterate it through N
        //first in last out, so that position - the position that removes it
        //go by the index
        int[] answers = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
            
            //System.out.println(temperatures[skibidi.peek()] + " " + temperatures[i]);
            while(!skibidi.isEmpty() && temperatures[skibidi.peek()] < temperatures[i]){
                int position = skibidi.pop();
                answers[position] = i - position; 
                System.out.println(i + " " + position);
            
            }
            skibidi.push(i);
        }

        return answers;

        
    }
}
