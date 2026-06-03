class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] number_db = new int[nums.length - k + 1];
        int counter = 0;
        Deque<Integer> chain = new ArrayDeque<>();

        //operations are addFirst(push), addLast(add), removeFirst(), removeLast()
        for(int i = 0; i< nums.length; i++){
            if(i >= k){
                if(chain.getFirst() == nums[i-k]){
                    chain.removeFirst();
                }
            }

            while(!chain.isEmpty() && chain.peekLast() < nums[i]){
                chain.removeLast();
            }
            chain.add(nums[i]);
            while(nums[i] > chain.getFirst()){
                chain.removeFirst();
                //System.out.println("hello");
            }
            
            if(i >= k - 1){
                number_db[counter] = chain.getFirst();
                counter++;
            }
        }
        
        return number_db;

    }
}